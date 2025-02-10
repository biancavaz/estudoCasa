import org.w3c.dom.Text;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static Reserva reserva = new Reserva();
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\n\uD83C\uDFE8 BEM VINDO AO HOTEL HEMMOS \uD83C\uDFE8");

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
                
                1 - 👩🏼‍🦰 HOSPEDES 
                2 - 🛏️ QUARTOS
                3 - 📅 FAZER RESERVAS
                4 - 📤 SAIR
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
        String nome = sc.next();

        System.out.println("Cpf: ");
        int cpf = sc.nextInt();

        System.out.println("Telefone: ");
        String telefone = sc.next();

        System.out.println("\n\uD83D\uDCDD Hóspede cadastrado! \n");
        GerenciadorHotel.adicionarHospedes(new Hospedes(nome, cpf, telefone));
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
        int numero = sc.nextInt();

        System.out.println("Tipo (simples, duplo, luxo): ");
        String tipo = sc.next();

        System.out.println("Preço da diária: ");
        double precoDiaria = sc.nextDouble();

        System.out.println("Quarto cadastrado! \uD83D\uDECF\uFE0F");

        GerenciadorHotel.adicionarQuartos(new Quarto(numero, tipo, precoDiaria));

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

        System.out.println("Informe o número da reserva:");
        reserva.setNumeroReserva(sc.nextInt());

        System.out.println("Informe o nome do hospede: ");
        String nome = sc.next();

        System.out.println("Informe o numero do quarto: ");
        int numero = sc.nextInt();

        System.out.print("Digite a data de entrada (formato: YYYY-MM-DD): ");
        String entrada = sc.next();

        System.out.print("Digite a data de saída (formato: YYYY-MM-DD): ");
        String saida = sc.next();

        // Converter as datas para LocalDate
        LocalDate dataEntrada = LocalDate.parse(entrada);
        LocalDate dataSaida = LocalDate.parse(saida);

        reserva.setDataEntrada(dataEntrada);
        reserva.setDataSaida(dataSaida);


        GerenciadorHotel.adicionarReservas(nome, numero, dataEntrada, dataSaida, reserva.getNumeroReserva());

    }

    public static void exibirReservas() {
        GerenciadorHotel.mostrarReservas();
    }

    public static void exibirValorTotaldeUmaReserva() {
        // pegar a reserva criada
        System.out.println("Digite o número da reserva: ");
        String numero = sc.next();

        Reserva reservaEscolhida = GerenciadorHotel.buscarReserva(Integer.parseInt(numero));

        if(reservaEscolhida != null){
            System.out.println("Valor total da reserva R$: " + reservaEscolhida.calcularPrecoPorReserva());
        } else {
            System.out.println("Reserva" + reservaEscolhida +" não encontrada");
        }
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