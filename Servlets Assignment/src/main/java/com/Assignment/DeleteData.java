package com.Assignment;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/deletedata")
public class DeleteData extends HttpServlet{

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
          String query = "DELETE FROM DATASTUDENTS WHERE id =?";
          Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          PreparedStatement ps = con.prepareStatement(query);
          int id = Integer.parseInt(request.getParameter("id"));
          ps.setInt(1, id);
          ps.executeUpdate();
          
            out.println("Data is deleted");
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
  

