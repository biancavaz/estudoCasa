public class Bebida extends Produto {

    private double volume;

    public Bebida (double volume, int id, String descricao, double preco){
        super(id, descricao, preco);
        this.volume = volume;
    }


    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }

    @Override
    public String exibirDetalhes() {
        return "Bebida:" +
                "\nVolme:" + volume;
    }



}
