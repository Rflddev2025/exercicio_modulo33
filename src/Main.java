import java.sql.Connection;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try (Connection conn = Database.connect();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS marca (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT NOT NULL
                );
            """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS carro (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    modelo TEXT NOT NULL,
                    marca_id INTEGER,
                    FOREIGN KEY (marca_id) REFERENCES marca(id)
                );
            """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS acessorio (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT NOT NULL
                );
            """);

            stmt.execute("""
                CREATE TABLE IF NOT EXISTS carro_acessorio (
                    carro_id INTEGER,
                    acessorio_id INTEGER,
                    PRIMARY KEY (carro_id, acessorio_id),
                    FOREIGN KEY (carro_id) REFERENCES carro(id),
                    FOREIGN KEY (acessorio_id) REFERENCES acessorio(id)
                );
            """);

            System.out.println("Banco e tabelas criados com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
