import java.sql.*;
public class dbHelper {
    private String userName=" ";// enter  your sql username
    private String password=" ";// enter  your sql password
    private String dbUrl=" ";// enter  your database URL
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void shorErrorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error Code : "+ exception.getErrorCode());
        
    }
    
    
}
