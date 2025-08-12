package com.Assignment;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet("/printuser")
public class PrintUser extends HttpServlet {

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		   
		         String DB_URL="jdbc:mysql://192.168.71.15:3306/intern";
		      
		       String USER = "intern2025";
		       String PASS = "intern2025";
		      response.setContentType("text/html");
		      PrintWriter out = response.getWriter();
		 
     try {
         
   	  Class.forName("com.mysql.jdbc.Driver");
         String query = "SELECT NAME,ID,AGE FROM DATASTUDENTS WHERE role =?";
         String userName = request.getParameter("role");
         Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
         PreparedStatement ps = con.prepareStatement(query);
		 ps.setString(1, userName);
         ResultSet rs = ps.executeQuery();
         while(rs.next()) {
        	 int id1  = rs.getInt("ID");
             String name1= rs.getString("NAME");
             int age = rs.getInt("AGE");
             
           out.println("<html><body>");
           out.println("<h2>User Information:</h2>");
           out.println("ID: " + id1 + "<br>");
           out.println(" NAME: " + name1 + "<br>");
           out.println(" Age: " + age + "<br>");
           out.println("</body></html>");
        
            
            out.println("<html><body>");
          
            out.println("<p>Role: " + (userName != null ? userName : "N/A") + "</p>");
            out.println("</body></html>");
         }
         
        out.println();
        ps.close();
        con.close();
     
     }
        catch(SQLException se) {
   	  System.out.println(se);
     } 
        catch(Exception e){
   	  System.out.println(e);
     }  

   

 
 }
}