import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static Hospedes hospedes = new Hospedes();
    public static Reserva reserva = new Reserva();
    public static Quarto quarto = new Quarto();
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("BEM VINDO AO HOTEL HEMMOS");
        inicio();

    }

    public static void inicio(){
        do {
            opcoesMenu();
            int opcao = sc.nextInt();
            exibirMenu(opcao);

        } while (true);
    }

    public static void opcoesMenu(){
        System.out.println("""
                1 - HOSPEDES
                2 - QUARTOS
                3 - FAZER RESERVAS
                4 - SAIR
                """);

    }

    public static void exibirMenu(int opcao){
        //terminar com do/while
        switch (opcao) {
            case 1: {
                int opcaoHospede;
                do {
                    opcoesHospedes();
                    opcaoHospede = sc.nextInt();
                    exibirOpcoesHospedes(opcaoHospede);
                } while (opcaoHospede !=4);
                break;
            }
            case 2: {
                int opcaoQuartos;
                do {
                    opcoesQuartos();
                    opcaoQuartos = sc.nextInt();
                    exibirOpcoesQuartos(opcaoQuartos);
                } while(opcaoQuartos !=3);
                break;
            }
            case 3: {
                int opcaoReserva;
                do{
                    opcoesReservas();
                    opcaoReserva = sc.nextInt();
                    exibirOpcoesReservas(opcaoReserva);

                } while (opcaoReserva != 4);
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }

    public static void opcoesHospedes() {
        System.out.println("""
                1 - CADASTRAR HOSPEDES
                2 - DELETAR HOSPEDES
                3 - EXIBIR HOSPEDES
                4 - SAIR
                """);
    }

    public static void exibirOpcoesHospedes(int opcao) {
        switch (opcao){
            case 1: {
                cadastroHospedes();
                break;
            }
            case 2: {
                removerHospedes();
            }
            case 3: {
                exibirHospedes();
            }
            case 4: {
                inicio();
            }
        }
    }

    public static void cadastroHospedes() {
        System.out.println("CADASTRO DE HOSPEDES");

        System.out.println("Nome: ");
        hospedes.setNome(sc.next());

        System.out.println("Cpf: ");
        hospedes.setCpf(sc.nextInt());

        System.out.println("Telefone: ");
        hospedes.setTelefone(sc.next());

        GerenciadorHotel.adicionarHospedes(hospedes);
    }

    public static void removerHospedes() {
        GerenciadorHotel.mostrarHospedes();

        System.out.println("Informe o nome do hospede (ou 0 para sair): ");
        String nome = sc.next();
        GerenciadorHotel.deletarHospedes(nome);

        if(nome.equals("0")){
            inicio();
        }

    }

    public static void exibirHospedes() {
        GerenciadorHotel.mostrarHospedes();
    }

    public static void opcoesQuartos() {
        System.out.println("""
                1 - CADASTRAR QUARTO
                2 - EXIBIR QUARTOS
                3 - SAIR
                """);
    }

    public static void exibirOpcoesQuartos(int opcao) {
        switch (opcao){
            case 1: {
                cadastroQuartos();
                break;
            }
            case 2: {
                mostrarQuartos();
            }
            case 3: {
                inicio();
            }
        }
    }

    public static void cadastroQuartos() {
        System.out.println(" CADASTRAR QUARTOS");

        System.out.println("Numero do quarto: ");
        quarto.setNumero(sc.nextInt());

        System.out.println("Tipo (simples, duplo, luxo): ");
        quarto.setTipo(sc.next());

        System.out.println("Preço da diária: ");
        quarto.setPrecoDiaria(sc.nextDouble());

        GerenciadorHotel.adicionarQuartos(quarto);

    }

    public static void mostrarQuartos() {
        GerenciadorHotel.mostrarQuartos();
    }

    public static void opcoesReservas() {
        System.out.println("""
                1 - FAZER RESERVA
                2 - EXIBIR RESERVAS
                3 - EXIBIR VALOR TOTAL
                4 - SAIR
                """);
    }

    public static void fazerReserva() {

        System.out.println("RESERVA");

        System.out.println("Informe o nome do hospede: ");
        String nome = sc.next();
       //reserva.setHospedes();

        System.out.println("Informe o numero do quarto: ");
        int numero = sc.nextInt();
        //reserva.setQuarto();

        System.out.print("Digite a data de entrada (formato: YYYY-MM-DD): ");
        String entrada = sc.next();

        System.out.print("Digite a data de saída (formato: YYYY-MM-DD): ");
        String saida = sc.next();

        // Converter as datas para LocalDate
        LocalDate dataEntrada = LocalDate.parse(entrada);
        LocalDate dataSaida = LocalDate.parse(saida);

        reserva.setDataEntrada(dataEntrada);
        reserva.setDataSaida(dataSaida);

        GerenciadorHotel.adicionarReservas(nome, numero, dataEntrada, dataSaida);


    }

    public static void exibirReservas() {
        GerenciadorHotel.mostrarReservas();
    }

    public static void exibirValorTotaldeUmaReserva() {
        reserva.calcularValorTotal();
        /// n seei como fazer hehe
    }

    public static void exibirOpcoesReservas(int opcao) {
        switch (opcao){
            case 1: {
                fazerReserva();
                break;
            }
            case 2: {
                exibirReservas();
                break;
            }
            case 3: {
                exibirValorTotaldeUmaReserva();
                break;
            }
            case 4: {
                inicio();
            }
        }
    }

}