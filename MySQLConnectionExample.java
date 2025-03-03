
package employeemanagementsystem;


import java.sql.*;


public class MySQLConnectionExample {
    public static void main(String[] args) {
     
        String url = "jdbc:mysql://localhost:3306/btm"; 
        String user = "root";
        String password = "Manas#863725";  
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
               
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt=con.createStatement();
            System.out.println("Records");
            String s="insert into student values(15,'Manas',78.8)";
            stmt.executeUpdate(s);
           
            
            if (con != null) {
                System.out.println("Connected to the database successfully!");
            }
             if (stmt != null) {
                System.out.println("Execute the Query successfully!");
            }
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        finally{
            if(con!=null){
                try{
                con.close();  
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            }
            if(stmt!=null){
                try{
                stmt.close();  
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
      
    }
    }
}
