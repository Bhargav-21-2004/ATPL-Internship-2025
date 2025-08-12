package com.Assignment;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
 @WebServlet("/dataAccess")
public class DataBaseAccess extends HttpServlet{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

     public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
   
    	 String name = request.getParameter("value");
         String DB_URL="jdbc:mysql://192.168.71.15:3306/intern";

      
       String USER = "intern2025";
       String PASS = "intern2025";
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
 
     
      try {
        
    	  Class.forName("com.mysql.jdbc.Driver");
          String query = "SELECT NAME,ID,AGE FROM DATASTUDENTS WHERE NAME =?";
         
          Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          PreparedStatement ps = con.prepareStatement(query);
          ps.setString(1, name);
          ResultSet rs = ps.executeQuery();
          while(rs.next()) {
             int id1  = rs.getInt("ID");
             String name1= rs.getString("NAME");
             int age = rs.getInt("AGE");
             
           out.println("ID: " + id1 + "<br>");
           out.println(" NAME: " + name1 + "<br>");
           out.println(" Age: " + age + "<br>");
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

