package com.hospital.controller;

import com.hospital.dao.PatientDAO;
import com.hospital.model.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/updatePatient")
public class UpdatePatientServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String illness = request.getParameter("illness");
        int doctorId = Integer.parseInt(request.getParameter("doctorId"));
        String room = request.getParameter("room");

        Patient updatedPatient = new Patient();
        updatedPatient.setId(id);
        updatedPatient.setIllnessDescription(illness);
        updatedPatient.setDoctorId(doctorId);
        updatedPatient.setRoomNumber(room);

        boolean result = PatientDAO.updatePatient(updatedPatient);

        if (result) {
            System.out.println(" Patient updated successfully");
            response.sendRedirect("viewPatients");
        } else {
            System.out.println("Patient update failed");
            response.sendRedirect("error.jsp");
        }
    }
}
