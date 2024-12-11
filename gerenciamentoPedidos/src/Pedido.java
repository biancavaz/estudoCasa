import java.util.ArrayList;

public class Pedido {

    ArrayList<Produto> itens;
    Cliente cliente;

    Pedido(Cliente cliente, ArrayList<Produto> itens) {
        this.cliente = cliente;
        this.itens = itens;

    }



}
