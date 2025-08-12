import java.sql.*;
public class UpdateMultiple {
    public static void main(String[]args){
        try{
            String query ="update users set email='bhargavkota3131@gamil.com',mobileno='9059512722' where userid=242";
            String Update_query= "select email,mobileno from users where userid=242";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            Statement stmt =con.createStatement();
            stmt.executeUpdate(query);
            ResultSet rs = stmt.executeQuery(Update_query);
            while(rs.next())
                System.out.println("the updated email and mobileno :" + rs.getString(1)+ " "+ rs.getInt(2));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
