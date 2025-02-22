import java.util.ArrayList;

public class GerenciadorDeCardapio {

    private static ArrayList<Produto> cardapio = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        cardapio.add(produto);
    }

    public void removerProduto(int codigo) {
        cardapio.remove(codigo);
    }

    public void editarProduto(int codigo, Produto novoProduto){
        int i=0;
        for (Produto p: this.cardapio){
            if ( p.getId() == codigo ){
                break;
            } else{
                i += 1;
            }
        }
        cardapio.set(i, novoProduto);
    }

    public static ArrayList<Produto> listarProdutos() {
        return cardapio;
    }
}
