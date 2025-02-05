public class Hospedes {

    private String nome;
    private int cpf;
    private String telefone;

    public Hospedes(String nome, int cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Hospedes(){};

    public void exibirDetalhes(){
        System.out.println(this.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Hospedes" +
                "nome: " + nome +
                "cpf: " + cpf +
                "telefone: " + telefone;
    }
}
