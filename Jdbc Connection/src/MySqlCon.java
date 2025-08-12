
import java.sql.*;
public class MySqlCon {
    public static void main(String[]args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from products");
            while(rs.next())
                System.out.println(rs.getInt("productid") +" "+ rs.getString("productname"));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}










