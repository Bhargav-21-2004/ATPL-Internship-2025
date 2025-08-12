import java.sql.*;
public class ReUsePs {
    public static void main(String[]args){
        try{
            String Query ="insert into users (username,userid,email,mobileno) values (?,?,?,?)";
            String update ="select * from users";
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setString(1,"Adhitya");
            ps.setInt(2,233);
            ps.setString(3,"Adhitya233@gmail.com");
            ps.setString(4,"9966588665");
            ps.executeUpdate();
            ps.setString(1,"Dileep");
            ps.setInt(2,201);
            ps.setString(3,"dillep201@gmail.com");
            ps.setString(4,"9494598987");
            ps.executeUpdate();
            ps.setString(1,"Naveen");
            ps.setInt(2,236);
            ps.setString(3,"naveen246@gmail.com");
            ps.setString(4,"7981035244");
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery(update);
            while(rs.next())
                System.out.println("The updated records:" + rs.getString("username") +" "+  rs.getInt("userid")+ " "+ rs.getString("email")+" "+ rs.getString("mobileno"));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
