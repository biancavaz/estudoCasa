public abstract class Produto {

    private int id;
    private String descricao;
    private double preco;


    public Produto (int id, String descricao, double preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract double calcularPreco(double desconto);


    public abstract String exibirDetalhes();
}
