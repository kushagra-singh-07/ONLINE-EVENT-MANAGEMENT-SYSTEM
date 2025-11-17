import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/eventdb?serverTimezone=UTC&useSSL=false";
    private static final String USER = "root"; 
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database!");
            e.printStackTrace();
        }
        return conn;
    }
}
