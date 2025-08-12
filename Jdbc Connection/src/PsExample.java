import java.sql.*;

public class PsExample {
    public static void main(String[]args){
        try{
            String Query ="select *  from users where username=? and userid=?";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setString(1,"bhargav");
            ps.setInt(2,242);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                System.out.println("the search name using preparedStatement:" + rs.getString("username") +" "+  rs.getInt("userid"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
