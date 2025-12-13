import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL =
        "jdbc:sqlite:C:/Users/User/Documents/exercicio_modulo33/carros.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
