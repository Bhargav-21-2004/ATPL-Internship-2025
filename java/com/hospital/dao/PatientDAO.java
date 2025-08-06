package com.hospital.dao;

import com.hospital.model.Patient;
import com.hospital.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    public static boolean addPatient(Patient patient) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection()) {
        	String sql = "INSERT INTO patients (name, age, gender, contact, illness_description, doctor_id, room_number, discharge_status) VALUES (?, ?, ?, ?, ?, ?, ?, false)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, patient.getName());
            ps.setInt(2, patient.getAge());
            ps.setString(3, patient.getGender());
            ps.setString(4, patient.getContact());
            ps.setString(5, patient.getIllnessDescription());
            ps.setInt(6, patient.getDoctorId());
            ps.setString(7, patient.getRoomNumber());

            int rows = ps.executeUpdate();
            System.out.println("Rows affected: " + rows);
            status = rows > 0;
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println(" GENERAL EXCEPTION: " + ex.getMessage());
            ex.printStackTrace();
        }
        return status;
    }
    public static List<Patient> getAllPatients() {
        List<Patient> list = new ArrayList<>();
        
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM patients";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt("patient_id"));
                p.setName(rs.getString("name"));
                p.setAge(rs.getInt("age"));
                p.setGender(rs.getString("gender"));
                p.setContact(rs.getString("contact"));
                p.setIllnessDescription(rs.getString("illness_description"));
                p.setDoctorId(rs.getInt("doctor_id"));
                p.setRoomNumber(rs.getString("room_number"));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    

    public static Patient getPatientById(int id) {
        Patient patient = null;

        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM patients WHERE patient_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                patient = new Patient();
                patient.setId(rs.getInt("patient_id"));
                patient.setName(rs.getString("name"));
                patient.setAge(rs.getInt("age"));
                patient.setGender(rs.getString("gender"));
                patient.setContact(rs.getString("contact"));
                patient.setIllnessDescription(rs.getString("illness_description"));
                patient.setDoctorId(rs.getInt("doctor_id"));
                patient.setRoomNumber(rs.getString("room_number"));
                patient.setDischargeStatus(rs.getBoolean("discharge_status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return patient;
    }

    public static boolean updatePatient(Patient patient) {
        boolean status = false;

        try (Connection con = DBConnection.getConnection()) {
            String sql = "UPDATE patients SET illness_description = ?, doctor_id = ?, room_number = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, patient.getIllnessDescription());
            ps.setInt(2, patient.getDoctorId());
            ps.setString(3, patient.getRoomNumber());
            ps.setInt(4, patient.getId());

            int rows = ps.executeUpdate();
            System.out.println("🔁 Rows updated: " + rows);
            status = rows > 0;
        } catch (Exception e) {
            System.out.println("Update SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }

        return status;
    }

    public static boolean deletePatient(int id) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection()) {
        	String sql = "DELETE FROM patients WHERE patient_id = ? AND discharge_status = 1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println("Deleted rows: " + rows);
            status = rows > 0;
        } catch (Exception e) {
            System.out.println("Delete error: " + e.getMessage());
            e.printStackTrace();
        }
        return status;
    }


    public static boolean dischargePatient(int id) {
        boolean status = false;
        try (Connection con = DBConnection.getConnection()) {
        	String sql = "UPDATE patients SET discharge_status = true, discharge_timestamp = NOW() WHERE patient_id = ?";
            System.out.println("Running SQL: " + sql + " with ID = " + id);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println("Updated rows: " + rows);
            status = rows > 0;
        } catch (Exception e) {
            System.out.println("Error while discharging: " + e.getMessage());
            e.printStackTrace();
        }
        return status;
    }




}
