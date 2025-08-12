import java.sql.*;
public class FetchData {
    public static void main(String[] args) {
        try {
            String Query = "select *  from products where price BETWEEN ? and ?";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1, 10000);
            ps.setInt(2, 20000);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                System.out.println("The Fetch products with range :" + rs.getString("productname") + " " + rs.getInt("productid") + " " + rs.getInt("price"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
