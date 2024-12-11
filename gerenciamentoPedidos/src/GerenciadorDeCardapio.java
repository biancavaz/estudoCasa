import java.util.ArrayList;

public class GerenciadorDeCardapio {

    ArrayList<Produto> cardapio = new ArrayList<>();


    public void editarProduto(int codigo, Produto novoProduto){
        int i=0;
        for(Produto p: this.cardapio){
            if(p.getCodigo().equals(codigo)){
                break;
            }else{
                i += 1;
            }

        }
        cardapio.set(i, novoProduto);
    }
}
