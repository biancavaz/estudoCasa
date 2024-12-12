import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private final String URL = "jdbc:mysql://localhost:300/gestao_escola";
    private final String USER = "root";
    private final String PASSWORD = "root";


    public Connection getConection () throws SQLException {

        return DriverManager.getConnection(URL, USER, PASSWORD);

    }
}
