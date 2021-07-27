import java.sql.*;
public class DbHelper {
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    private String userName="root";
    private String password="Aslanlar_528";
    
    
   public Connection getConnection()throws SQLException{
       return DriverManager.getConnection(dbUrl, userName, password);
   }
   
   public void showErrorMessage(SQLException exception){
       System.out.println("Error: " + exception.getMessage());
       System.out.println("Error code : " + exception.getErrorCode());
   }
    
}
