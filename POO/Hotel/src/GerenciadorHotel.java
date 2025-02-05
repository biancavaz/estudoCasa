import java.util.ArrayList;

public class GerenciadorHotel {

    static ArrayList<Hospedes> hospedeslista = new ArrayList<>();
    static ArrayList<Quarto> quartoslista = new ArrayList<>();

    public static void adicionarHospedes(Hospedes hospedes){
        hospedeslista.add(hospedes);
    }

    public static void deletarHospedes(Hospedes hospedes){
        hospedeslista.remove(hospedes);
    }

    public static void adicionarQuartos(Quarto quarto){
        quartoslista.add(quarto);
    }

    public static void deletarQuartos(Quarto quarto){
        quartoslista.remove(quarto);
    }
}
