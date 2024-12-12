import java.util.ArrayList;

public class Combo extends Produto {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private double desconto;


    public Combo (int id, String descricao, double preco, double desconto, ArrayList<Produto> produtos ) {
        super(id, descricao, preco);
        this.desconto = desconto;
        this.produtos = produtos;
    }

    public double calcularDesconto (){
        return  0;
    }

    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }

    @Override
    public String exibirDetalhes() {
        return "Combo: " +
                "\nProdutos: " + produtos +
                "\nDesconto: " + desconto;
    }
}
