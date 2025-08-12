import java.sql.*;
public class MySqlUpdate {
    public static void main(String[]args){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
            Statement stmt = con.createStatement();
            int updated = stmt.executeUpdate("update users set email='bhargav32@gmail.com' where userid=242 ");
            if(updated>0){
                System.out.println("it is updated");
            }
            else{
                System.out.println("not updated");
            }
            con.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
