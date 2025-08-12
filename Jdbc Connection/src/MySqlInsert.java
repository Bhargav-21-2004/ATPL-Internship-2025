import java.sql.*;
public class MySqlInsert {
    public static void main(String[]args){
        try {
            String url = "jdbc:mysql://192.168.71.15:3306/intern";
            String user = "intern2025";
            String pass = "intern2025";
            String query = "insert into users (username,userid,email,mobileno) values (?,?,?,?)";
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Ganeswarrao");
            ps.setInt(2, 239);
            ps.setString(3, "Ganeswar239@gamil.com");
            ps.setString(4, "8787523234");
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected>0){
                System.out.println("data inserted");
            }
            else{
                System.out.println("data insertion failed");
            }
                con.close();
        }
            catch(Exception e){
                System.out.println(e);
        }
    }

}
