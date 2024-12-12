import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> itens;
    private Cliente cliente;

    private String status = "pendente";

    public Pedido (Cliente cliente, ArrayList<Produto> itens) {
        this.cliente = cliente;
        this.itens = itens;

    }

    public void adicionarItem (Produto item){
        itens.add(item);
    }

    public void removerItem (int codigo){
        itens.remove(codigo);
    }

    public double calcularTotal (){
        return 0;
    }

    public void confirmarPedido (){
        status = "em andamento";
    }


}
