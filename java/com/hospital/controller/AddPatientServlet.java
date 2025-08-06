package com.hospital.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospital.dao.PatientDAO;
import com.hospital.model.Patient;

@WebServlet("/addPatient")
public class AddPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String contact = request.getParameter("contact");
        String illness = request.getParameter("illness");
        int doctorId = Integer.parseInt(request.getParameter("doctorId"));
        String room = request.getParameter("room");


        Patient patient = new Patient();
        patient.setName(name);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setContact(contact);
        patient.setIllnessDescription(illness);
        patient.setDoctorId(doctorId);
        patient.setRoomNumber(room);

        System.out.println("Servlet triggered. Trying to add patient...");

        
        boolean result = PatientDAO.addPatient(patient);
        System.out.println(" DAO insert result: " + result);

        if (result) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
