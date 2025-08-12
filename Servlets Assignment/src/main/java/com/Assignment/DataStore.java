package com.Assignment;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
 @WebServlet("/datastore")
public class DataStore extends HttpServlet{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

     public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
   
      
      String DB_URL="jdbc:mysql://192.168.71.15:3306/intern";
       String USER = "intern2025";
       String PASS = "intern2025";
      res.setContentType("text/html");
      PrintWriter out = res.getWriter();
      out.println();
 
      
      try {
    	  Class.forName("com.mysql.jdbc.Driver");
          String query = "insert into DATASTUDENTS(ID,NAME,AGE,role) values (?,?,?,?)";
          Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          PreparedStatement ps = con.prepareStatement(query);
          int id = Integer.parseInt(req.getParameter("id"));
          String name= req.getParameter("name");
          int age= Integer.parseInt(req.getParameter("age"));
          String role = req.getParameter("role");
          out.println("Students are inserted");
          ps.setInt(1, id);
          ps.setString(2, name);
          ps.setInt(3, age);
          ps.setString(4, role);
          ps.executeUpdate();	
          ps.close();
        
           con.close();
      }
          catch(Exception e){
              System.out.println(e);
      }
    }
  }

