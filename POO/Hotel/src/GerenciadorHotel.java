import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorHotel {

    static ArrayList<Hospedes> hospedeslista = new ArrayList<>();
    static ArrayList<Quarto> quartoslista = new ArrayList<>();
    static ArrayList<Reserva> reservaslista = new ArrayList<>();

    //HOSPEDES
    public static void adicionarHospedes(Hospedes hospedes){
        hospedeslista.add(hospedes);
    }

    public static void deletarHospedes(String nome){
        boolean encontrado = false;
        for (Hospedes hospedes : hospedeslista) {
            if (hospedes.getNome().equals(nome)) {
                hospedeslista.remove(hospedes);
                System.out.println("Hospedes removido com sucesso!");;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Hospede com o nome" + nome + "nao encontrado!");
        }
    }

    public static void mostrarHospedes() {
        if(hospedeslista.isEmpty()){
            System.out.println("Nenhum hospede encontrado");
        } else {
            for (Hospedes hospedes : hospedeslista) {
                System.out.println(hospedes.toString());
            }
        }
    }

    // QUARTOS
    public static void adicionarQuartos(Quarto quarto){
        quartoslista.add(quarto);
    }

    public static void deletarQuartos(int numero){
        boolean encontrado = false;
        for (Quarto quartos : quartoslista) {
            if (quartos.getNumero() == numero) {
                quartoslista.remove(quartos);
            }
        }
        if (!encontrado) {
            System.out.println("Quarto" + numero + " nao encontrado");
        }
    }

    public static void mostrarQuartos() {
        if(quartoslista.isEmpty()){
            System.out.println("Nenhum quarto encontrado");
        } else{
            for (Quarto quartos : quartoslista) {
                System.out.println(quartos.toString());
            }
        }
    }

    //RESERVAS
    public static void adicionarReservas(String nomeHospede, int numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida){
        Hospedes hospedeselecionado = null;
        for(Hospedes hospedes : hospedeslista){
            if(hospedes.getNome().equals(nomeHospede)){
                hospedeselecionado = hospedes;
                break;
            }
        }
        if(hospedeselecionado == null){
            System.out.println("hospede" + nomeHospede + "nao encontrado");
        }

        Quarto quartoselecionado = null;
        for(Quarto quartos : quartoslista) {
            if(quartos.getNumero() == numeroQuarto){
                quartoselecionado = quartos;
                break;
            }
        }

        if(quartoselecionado == null){
            System.out.println("quarto" + numeroQuarto + " nao encontrado");
        }

        if(quartoselecionado.reservar(dataEntrada, dataSaida)) {
            Reserva reserva = new Reserva(dataEntrada, dataSaida,hospedeselecionado, quartoselecionado);
            quartoselecionado.reservar(reserva);
            reservaslista.add(reserva);
            System.out.println("Reserva para" + hospedeselecionado + "criada com sucesso!");
        } else {
            System.out.println("O quarto" + numeroQuarto + " não está disponível");
        }

    }

    //tem como deletar uma resereva?

    public static void mostrarReservas() {
        if(reservaslista.isEmpty()){
            System.out.println("Nenhum reserva encontrado");
        } else {
            for(Reserva reserva : reservaslista) {
                System.out.println(reserva.toString());
            }
        }
    }

}
