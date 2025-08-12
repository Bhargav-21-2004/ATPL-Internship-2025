import java.sql.*;
public class SafeDelete {
    public static void main(String[]args){
        try{
            String Query="delete from users where dob<'2000-01-21'";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            Statement stmt =con.createStatement();
            stmt.executeUpdate(Query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
