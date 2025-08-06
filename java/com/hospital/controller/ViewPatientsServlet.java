package com.hospital.controller;

import com.hospital.dao.PatientDAO;
import com.hospital.model.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/viewPatients")
public class ViewPatientsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String searchIdParam = request.getParameter("searchId");
        List<Patient> patients = new ArrayList<>();

        if (searchIdParam != null && !searchIdParam.trim().isEmpty()) {
            try {
                int searchId = Integer.parseInt(searchIdParam.trim());
                Patient p = PatientDAO.getPatientById(searchId);
                if (p != null) {
                    patients.add(p);
                }
            } catch (NumberFormatException e) {
                
            }
        } else {
            patients = PatientDAO.getAllPatients();
        }

        request.setAttribute("patients", patients);
        request.getRequestDispatcher("viewPatients.jsp").forward(request, response);
    }
}
