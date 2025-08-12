package com.Assignment;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/activeusers")
public class ActiveUser extends HttpServlet{

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
          String query = "SELECT * FROM DATASTUDENTS";
          Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          PreparedStatement ps = con.prepareStatement(query);
          ResultSet rs = ps.executeQuery();
          while(rs.next()) {
             int id1  = rs.getInt("ID");
             String name1= rs.getString("NAME");
             int age = rs.getInt("AGE");
             String role =rs.getString("role");
             
           out.println("ID: " + id1 + "<br>");
           out.println(" NAME: " + name1 + "<br>");
           out.println(" Age: " + age + "<br>");
           out.println(" ROLE: " + role + "<br>");
           out.println("<br>");
          }
         rs.close();
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

