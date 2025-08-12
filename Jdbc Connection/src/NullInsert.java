import java.sql.*;
public class NullInsert {
    public static void main(String[]args) {
        try {
            String query = "insert into products (productname,productid,price) values(?,?,?)";
            String Result = "Select * from products";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Nothing");
            ps.setInt(2, 8897);
            ps.setNull(3, java.sql.Types.VARCHAR);
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery(Result);
            while (rs.next())
                System.out.println("After inserting the results are:" + rs.getString("productname") + " " + rs.getInt("productid") + " " + rs.getInt("price"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
