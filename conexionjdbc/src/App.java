import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    static String url="jdbc:mysql://localhost:3306/TestDB";
    static String userName="root";
    static String password="Pass_123";

    public static void main(String[] args) throws Exception {
        try (Connection conn=DriverManager.getConnection(url, userName, password)){
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
