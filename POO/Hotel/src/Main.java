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
                opcoesHospedes();
                break;
            }
            case 2: {
                opcoesQuartos();
                break;
            }
            case 3: {
                opcoesReservas();
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

            }
            case 3: {

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

    }

    //fazer a lógica do de remover hóspede

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

                break;
            }
            case 2: {

            }
            case 3: {
                inicio();
            }
        }
    }

    public static void opcoesReservas() {
        System.out.println("""
                1 - CADASTRAR RESERVA
                2 - EXIBIR RESERVAS
                3 - EXIBIR VALOR TOTAL
                4 - SAIR
                """);
    }

    public static void exibirOpcoesReservas(int opcao) {
        switch (opcao){
            case 1: {

                break;
            }
            case 2: {

            }
            case 3: {

            }
            case 4: {
                inicio();
            }
        }
    }







}