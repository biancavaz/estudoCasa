import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Quarto {

    private int numero;
    private String tipo;
    private double precoDiaria;
    private boolean disponivel = true;
    private List<Reserva> reservas = new ArrayList();

    public Quarto(int numero, String tipo, double precoDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
    }

    public Quarto(){};

    public void exibirDetalhesReserva (){
        System.out.println("Quarto");
        System.out.println("Numero do quarto: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Preco diaria: " + precoDiaria);
        System.out.println("Disponibilidade" + (disponivel? "sim" : "não"));
    }

    public boolean reservar(LocalDate dataEntrada, LocalDate dataSaida ){
        for (Reserva reserva : reservas){
            if(dataEntrada.isBefore(reserva.getDataSaida()) && dataSaida.isAfter(reserva.getDataEntrada()) ||
                    (dataEntrada.isEqual(reserva.getDataEntrada())) || (dataSaida.isEqual(reserva.getDataSaida()))) {
                disponivel = false;
                return false;
            }
        }
        disponivel = true;
        return true;
    }

    public void reservar(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public String toString() {
        System.out.println("QUARTOS");
        return "\ndisponivel: " + (disponivel? "sim" : "não") +
                "\nnumero: " + numero +
                "\ntipo: " + tipo +
                "\nprecoDiaria: " + precoDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
