package com.hospital.controller;

import com.hospital.dao.PatientDAO;
import com.hospital.model.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/editPatient")
public class EditPatientServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Patient patient = PatientDAO.getPatientById(id);
        request.setAttribute("patient", patient);
        request.getRequestDispatcher("editPatient.jsp").forward(request, response);
    }
}
