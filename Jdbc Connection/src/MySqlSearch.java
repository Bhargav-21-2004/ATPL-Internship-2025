import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlSearch {
    public static void main(String[]args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            PreparedStatement ps = con.prepareStatement("select * from products where productname like ?");
            ps.setString(1,"%phone");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                System.out.println("the search name using like operator:" + rs.getString("productname") +" "+  rs.getInt("productid"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
