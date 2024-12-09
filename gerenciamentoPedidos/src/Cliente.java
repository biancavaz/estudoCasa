import java.util.ArrayList;

public class Cliente extends Pessoa {

    ArrayList<Pedido> pedidos = new ArrayList<>();


    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void fazerPedido (Pedido pedido){
        if(pedido != null){
            pedidos.add(pedido);
            System.out.println("Pedido adicionado"+pedido);
        } else {
            System.out.println("pedido inválido");
        }
    }

    public void cancelarPedido(Pedido pedido){
        if(pedido!= null) {
            pedidos.remove(pedido);
            System.out.println("Pedido cancelado!");
        } else {
            System.out.println("Não foi possível cancelar esse pedido.");
        }
    }

    public String visualizarPedidos() {
        String dados = "Cliente: " + this.getNome();
        for (Pedido pedido : pedidos){
            dados += pedido.toString();
        }

        return dados;
    }
}
