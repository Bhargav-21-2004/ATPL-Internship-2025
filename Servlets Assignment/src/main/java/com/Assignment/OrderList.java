package com.Assignment;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

@WebListener("/orderlist")
public class OrderList implements ServletRequestListener {
	
    public void requestDestroyed(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        HttpSession session = request.getSession(false);
        if (session != null) {
            
			Object itemId = session.getAttribute("itemid");
			Object quantity = session.getAttribute("Quantity");
			Object date = session.getAttribute("Date");
			
            if (date != null && itemId != null && quantity != null) {
                Timestamp ts = (Timestamp) date;
                String orderTime = ts.toLocalDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"));
                System.out.println("Order Date : " + orderTime + ", Item ID : " + itemId + ", Item Qty :" + quantity);

                session.removeAttribute("itemid");
                session.removeAttribute("Quantity");
                session.removeAttribute("Date");
            }
        }
    }
}