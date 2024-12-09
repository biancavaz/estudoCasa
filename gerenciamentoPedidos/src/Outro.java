public class Outro extends Produto {

    private String tamanho;

    public Outro (String tamanho, int id, String descricao, double preco){
        super(id, descricao, preco);
        this.tamanho = tamanho;
    }


    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }


    @Override
    public String exibirDetalhes() {
        return "Outro: " +
                "\nTamanho:" + tamanho;
    }

}
