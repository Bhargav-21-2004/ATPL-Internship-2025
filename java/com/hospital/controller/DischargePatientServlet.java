package com.hospital.controller;

import com.hospital.dao.PatientDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/dischargePatient")
public class DischargePatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        boolean result = PatientDAO.dischargePatient(id);

        if (result) {
            System.out.println("Successfully discharged patient with ID: " + id);
            response.sendRedirect("viewPatients");
        } else {
            System.out.println("Failed to discharge patient with ID: " + id);
            response.setContentType("text/html");
            response.getWriter().println("<h2 style='color:red;'>Failed to discharge patient.</h2>");
            response.getWriter().println("<a href='viewPatients'>Back to list</a>");
        }
    }
}

