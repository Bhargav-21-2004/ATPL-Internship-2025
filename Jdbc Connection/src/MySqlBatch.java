import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlBatch {
    public static void main(String[]args){
        try{
            String query1 = " insert into users (username,userid,email,mobileno) values ('Venky',238,'venakat238@gamil.com','7813528577') ";
            String query2 = " insert into users (username,userid,email,mobileno) values ('Jeswanth',225,'jeswanth225@gamil.com','8790865362') ";
            String query3 = " insert into users (username,userid,email,mobileno) values ('Adhitya',233,'adhitya233@gamil.com','8897496575') ";

            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            String query = "insert into users (username,userid,email,mobileno) values ('Chandra',231,'chandra231@gamil.com','8897496575')";
            stmt.addBatch(query);
            stmt.addBatch(query1);
            stmt.addBatch(query2);
            stmt.addBatch(query3);
            stmt.executeBatch();
            con.commit();
            int update= stmt.executeUpdate(query1);
            if(update>0){
                System.out.println("updated the rows");
            }
            else{
                System.out.println("Not updated");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
