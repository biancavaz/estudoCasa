import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();
        Garcom garcom = new Garcom();
        Lanche lanche = new Lanche(12, 23, "mwiniwdw", 23);

        Lanche lanche1 = new Lanche(12, 25, "mwiniwdw", 23);
        GerenciadorDeCardapio gerenciadorDeCardapio = new GerenciadorDeCardapio();

//
//        lista.add(new Lanche(0, 0, null, 0));
//        lista.add(null);
//
//        Pedido pedido = new Pedido(null, lista );

        gerenciadorDeCardapio.adicionarProduto(lanche);

        gerenciadorDeCardapio.adicionarProduto(lanche1);
//
        garcom.exibirMenu();
    }
}