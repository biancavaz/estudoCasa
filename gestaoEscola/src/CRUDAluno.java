import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDAluno {

    BancoDeDados bancoDeDados = new BancoDeDados();

    //create
    public Aluno crete (Aluno aluno) {

        try (Connection con = bancoDeDados.getConection()) {

            PreparedStatement ps = con.prepareStatement("INSERT INTO (nome, telefone) VALUES (?, ?, ?) ", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getTelefone());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()) {
                aluno.setId(rs.getInt(1));
                return aluno;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        throw  new RuntimeException();
    }


    //delete
    public void delete (int id){

        try (Connection con = bancoDeDados.getConection()){

            PreparedStatement ps = con.prepareStatement("DELETE FROM alunos WHERE id =? ");

            ps.setInt(1, id);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        throw new RuntimeException();
    }


    //update
    public void update (Aluno aluno) {

        try (Connection con = bancoDeDados.getConection()) {

            PreparedStatement ps = con.prepareStatement("UPADATE alunos SET nome = ?, telefone = ?, WHERE id = ?");

            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getTelefone());
            ps.setInt(3, aluno.getId());
            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        throw new RuntimeException();
    }


    public Aluno readOne (int id) {

        try (Connection con = bancoDeDados.getConection()){

            PreparedStatement ps = con.prepareStatement("SELECT * FROM alunos WHERE id = ?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                int id_aluno = rs.getInt("id");
                String nome = rs.getString("nome");
                int telefone = rs.getInt("telefone");
                return new Aluno(id_aluno, nome, telefone);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        throw new RuntimeException();
    }


    public List<Aluno> readAll () {

        List<Aluno> alunos = new ArrayList<>();

        try (Connection con = bancoDeDados.getConection()) {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM alunos ");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nome  = rs.getString("nome");
                int telefone = rs.getInt("telefone");

                alunos.add(new Aluno(id, nome, telefone));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
         throw new RuntimeException();
    }

}
