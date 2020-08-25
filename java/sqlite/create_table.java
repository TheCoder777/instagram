import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table {

    public static void main(String[] args) {
        final String PATH = "jdbc:sqlite:./people.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(PATH);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE if not exists people"
            + "(id INTEGER PRIMARY KEY, name TEXT, age INTEGER)");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
