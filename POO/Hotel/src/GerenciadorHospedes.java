import java.util.ArrayList;

public class GerenciadorHospedes {

    static ArrayList<Hospedes> hospedeslista = new ArrayList<>();

    public static void adicionarHospedes(Hospedes hospedes){
        hospedeslista.add(hospedes);
    }

    public static void deletarHospedes(Hospedes hospedes){
        hospedeslista.remove(hospedes);
    }
}
