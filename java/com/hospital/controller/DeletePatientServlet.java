package com.hospital.controller;

import com.hospital.dao.PatientDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/deletePatient")
public class DeletePatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        boolean result = PatientDAO.deletePatient(id);

        if (result) {
            System.out.println(" Deleted patient with ID: " + id);
            response.sendRedirect("viewPatients");
        } else {
            System.out.println(" Deletion failed. Patient might not be discharged.");
            request.setAttribute("errorMessage", "Deletion failed. Patient must be discharged before deletion.");
            request.getRequestDispatcher("viewPatients").forward(request, response);
        }
    }
}
