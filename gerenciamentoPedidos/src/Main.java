import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Lanche(0, 0, null, 0));
        lista.add(null);

        Pedido pedido = new Pedido(null, lista );
    }
}