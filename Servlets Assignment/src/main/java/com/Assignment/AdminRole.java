package com.Assignment;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class AdminRole implements Filter {
	
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String role = httpRequest.getParameter("role");

        if ("Admin".equals(role)) {
            chain.doFilter(request, response); 
        } else {
            httpResponse.sendError( 0, "Access Denied: Admin role required.");
        }
    }

   
    public void destroy() {
       
    }
}

