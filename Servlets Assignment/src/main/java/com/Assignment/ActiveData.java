package com.Assignment;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/activedata")
public class ActiveData extends HttpServlet{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private static final int Id = 0;

     public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
   
      
      String DB_URL="jdbc:mysql://192.168.71.15:3306/intern";

      
       String USER = "intern2025";
       String PASS = "intern2025";
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
      try  { 
    	  Class.forName("com.mysql.jdbc.Driver");
          String sql = "UPDATE admin_table SET is_active = ? WHERE id = ?";
          Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          PreparedStatement pstmt = con.prepareStatement(sql);
          boolean isActive = false;
		  pstmt.setBoolean(1, isActive);
          pstmt.setInt(2, Id);

          int rowsAffected = pstmt.executeUpdate();

          if (rowsAffected > 0) {
              response.getWriter().write("Admin status updated successfully.");
          } else {
              response.getWriter().write("Admin not found or status already set.");
          }
          pstmt.executeUpdate();
          
          out.println("IS ACTIVE"+ isActive);
         pstmt.close();
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
  

