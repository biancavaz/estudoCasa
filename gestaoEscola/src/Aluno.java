public class Aluno {

    private int id;
    private String nome;
    private int telefone;

    public Aluno (int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
