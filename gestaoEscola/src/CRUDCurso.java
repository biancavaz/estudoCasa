import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDCurso {


    //banco de dados
//    private final String URL = "jdbc:mysql://localhost:300/gestao_escola";
//    private final String USER = "root";
//    private final String PASSWORD = "root";
//
//
//    public Connection getConection () throws SQLException {
//
//        return DriverManager.getConnection(URL, USER, PASSWORD);
//
//    }


    //crud foreign key
//    private final BancoDeDados bancoDeDados = new BancoDeDados();
//
//
//    public Inscricao create (int eventosId, int participantesId) {
//
//        CRUDEvento crudEvento = new CRUDEvento();
//        CRUDParticipante crudParticipante = new CRUDParticipante();
//
//        try( Connection con = bancoDeDados.getConexao()) {
//
//            PreparedStatement ps = con.prepareStatement("INSERT INTO Inscricao ( id_participantes, id_eventos) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
//
//            ps.setInt(1, participantesId);
//            ps.setInt(2,eventosId);
//            ps.execute();
//
//            ResultSet rs = ps.getGeneratedKeys();
//
//            if(rs.next()) {
//                Inscricao inscricao = new Inscricao(rs.getInt(1),
//                        crudParticipante.readOne(participantesId),
//                        crudEvento.readOne(eventosId));
//                return inscricao;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//
//
//    // DELETE
//    public void delete (int idInscricao) {
//
//        try(Connection con = bancoDeDados.getConexao()) {
//
//            PreparedStatement ps = con.prepareStatement("DELETE FROM inscricao WHERE id_incricoes = ?");
//
//            ps.setInt(1, idInscricao);
//            ps.execute();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//
//    public Inscricao readOne(int idInscricao) {
//
//        try(Connection con = bancoDeDados.getConexao()) {
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM Inscricoes WHERE id_inscricoes = ?");
//
//            ps.setInt(1, idInscricao);
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                int id_inscricao = rs.getInt("id_inscricoes");
//                int idParticipante = rs.getInt("id_participantes");
//                int idEvento = rs.getInt("id_eventos");
//
//                CRUDParticipante crudParticipante = new CRUDParticipante();
//                Participante participante = crudParticipante.readOne(idParticipante);
//
//                CRUDEvento crudEvento = new CRUDEvento();
//                Evento evento = crudEvento.readOne(idEvento);
//
//                return new Inscricao (id_inscricao, participante, evento);
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//

    //crud normal
//    BancoDeDados bancoDeDados = new BancoDeDados();
//
//    //create
//    public Aluno crete (Aluno aluno) {
//
//        try (Connection con = bancoDeDados.getConection()) {
//
//            PreparedStatement ps = con.prepareStatement("INSERT INTO (nome, telefone) VALUES (?, ?, ?) ", Statement.RETURN_GENERATED_KEYS);
//
//            ps.setString(1, aluno.getNome());
//            ps.setInt(2, aluno.getTelefone());
//            ps.execute();
//
//            ResultSet rs = ps.getGeneratedKeys();
//
//            if(rs.next()) {
//                aluno.setId(rs.getInt(1));
//                return aluno;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        throw  new RuntimeException();
//    }
//
//
//    //delete
//    public void delete (int id){
//
//        try (Connection con = bancoDeDados.getConection()){
//
//            PreparedStatement ps = con.prepareStatement("DELETE FROM alunos WHERE id =? ");
//
//            ps.setInt(1, id);
//            ps.execute();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//
//
//    //update
//    public void update (Aluno aluno) {
//
//        try (Connection con = bancoDeDados.getConection()) {
//
//            PreparedStatement ps = con.prepareStatement("UPADATE alunos SET nome = ?, telefone = ?, WHERE id = ?");
//
//            ps.setString(1, aluno.getNome());
//            ps.setInt(2, aluno.getTelefone());
//            ps.setInt(3, aluno.getId());
//            ps.execute();
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//
//
//    public Aluno readOne (int id) {
//
//        try (Connection con = bancoDeDados.getConection()){
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM alunos WHERE id = ?");
//
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//
//            if(rs.next()) {
//                int id_aluno = rs.getInt("id");
//                String nome = rs.getString("nome");
//                int telefone = rs.getInt("telefone");
//                return new Aluno(id_aluno, nome, telefone);
//            }
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        throw new RuntimeException();
//    }
//
//
//    public List<Aluno> readAll () {
//
//        List<Aluno> alunos = new ArrayList<>();
//
//        try (Connection con = bancoDeDados.getConection()) {
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM alunos ");
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String nome  = rs.getString("nome");
//                int telefone = rs.getInt("telefone");
//
//                alunos.add(new Aluno(id, nome, telefone));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        throw new RuntimeException();
//    }
//
//







}
