public class Lanche extends Produto  {


    private double peso;

    public Lanche(double peso, int id, String descricao, double preco ) {
        super(id, descricao, preco);
        this.peso = peso;
    }


    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }

    @Override
    public String exibirDetalhes() {
        return "\nLanche: " + super.toString()+
                "\nPeso:" + peso + "\n";
    }

}
