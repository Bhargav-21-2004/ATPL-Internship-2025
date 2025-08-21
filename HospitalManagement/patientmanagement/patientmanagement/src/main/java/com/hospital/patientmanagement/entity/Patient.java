package com.hospital.patientmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "patientsdata")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;
    private String name;
    private int age;
    private String gender;
    private String contact;
    private String illnessDescription;
    private int doctorId;
    private String roomNumber;
    private boolean dischargeStatus = false;

    private LocalDateTime admissionTimestamp = LocalDateTime.now();
    private LocalDateTime dischargeTimestamp;


    public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getIllnessDescription() {
		return illnessDescription;
	}
	public void setIllnessDescription(String illnessDescription) {
		this.illnessDescription = illnessDescription;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean isDischargeStatus() {
		return dischargeStatus;
	}
	public void setDischargeStatus(boolean dischargeStatus) {
		this.dischargeStatus = dischargeStatus;
	}
	public LocalDateTime getAdmissionTimestamp() {
		return admissionTimestamp;
	}
	public void setAdmissionTimestamp(LocalDateTime admissionTimestamp) {
		this.admissionTimestamp = admissionTimestamp;
	}
	public LocalDateTime getDischargeTimestamp() {
		return dischargeTimestamp;
	}
	public void setDischargeTimestamp(LocalDateTime dischargeTimestamp) {
		this.dischargeTimestamp = dischargeTimestamp;
	}
	
    
}


