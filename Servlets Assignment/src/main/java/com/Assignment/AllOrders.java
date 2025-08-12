package com.Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ordersinfo")
public class AllOrders extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String url  = "jdbc:mysql://192.168.71.15:3306/intern";
	private static final String user = "intern2025";
	private static final String password = "intern2025";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("itemId");
		String quantity = request.getParameter("itemQuantity");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if (id == null || quantity == null) {
			writer.println("<h2>Order Details are missing.</h2>");
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection(url, user, password)) { 
				
				String query = "insert into orderdetails (itemid, quantity, date) values (?, ?, ?)";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, Integer.parseInt(id));
				statement.setInt(2, Integer.parseInt(quantity));
				
				Timestamp now = new Timestamp(System.currentTimeMillis());
				statement.setTimestamp(3, now);
				
				int row = statement.executeUpdate();
				
				if (row > 0) {
					
					HttpSession session = request.getSession();
					
					session.setAttribute("ItemId", id);
					session.setAttribute("Item Quantity", quantity);
					session.setAttribute("Ordered time", now);
					
					writer.println("<h2>Data Stored Successfully!</h2>");
				}
				else {
					writer.println("<h2>Failed to store the data!</h2>");
				}
			}
		}
		catch (Exception e) {
			writer.println("<h2>Error : " + e.getMessage() + "</h2>");
			e.printStackTrace(writer);
		}
	}
}