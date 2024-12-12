public class Garcom extends Pessoa {

    private double pagamento;

    public void cadastrarPedido(Cliente cliente, Pedido pedido) {
       cliente.fazerPedido(pedido);
    }

    public String exibirMenu () {

        String menu = "";

        for (Produto produto : GerenciadorDeCardapio.listarProdutos()){
            menu += produto.exibirDetalhes();
        }
        System.out.println(menu);
       return menu;
    }

    public void adicionarItemAoPedido(Pedido pedido, Produto item) {
        pedido.adicionarItem(item);
    }

    public void removerItemDoPedido(Pedido pedido, int codigo){
        pedido.removerItem(codigo);
    }

    public void confirmarPedido(Pedido pedido) {
        pedido.confirmarPedido();
    }

    public double calcularPagamento(Pedido pedido) {
        return 0;
    }
}
