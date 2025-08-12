import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Vulnerable {
    public static void main(String[]args){
        try{
            String username="bhargav";
            int userid =242;
            String query= "select * from users where username = '"+username+"' and userid="+userid;
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            Statement stmt = con.createStatement();
            ResultSet rs =stmt.executeQuery(query);
            while(rs.next())
                System.out.println("The user name and id is:" + rs.getString("username") +" "+ rs.getInt("userid"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
