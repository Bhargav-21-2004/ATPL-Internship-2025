package com.hospital.model;

import java.security.Timestamp;

public class Patient {
	 private int id;
	    private String name;
	    private int age;
	    private String gender;
	    private String contact;
	    private String illnessDescription;
	    private int doctorId;
	    private String roomNumber;

	    
	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getAge() { return age; }
	    public void setAge(int age) { this.age = age; }

	    public String getGender() { return gender; }
	    public void setGender(String gender) { this.gender = gender; }

	    public String getContact() { return contact; }
	    public void setContact(String contact) { this.contact = contact; }

	    public String getIllnessDescription() { return illnessDescription; }
	    public void setIllnessDescription(String illnessDescription) { this.illnessDescription = illnessDescription; }

	    public int getDoctorId() { return doctorId; }
	    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

	    public String getRoomNumber() { return roomNumber; }
	    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
	    private boolean dischargeStatus;
	    public boolean isDischargeStatus() {
	        return dischargeStatus;
	    }

	    public void setDischargeStatus(boolean dischargeStatus) {
	        this.dischargeStatus = dischargeStatus;
	    }
	    public Timestamp getAdmissionTimestamp() {
			return admissionTimestamp;
		}
		public void setAdmissionTimestamp(Timestamp admissionTimestamp) {
			this.admissionTimestamp = admissionTimestamp;
		}
		public Timestamp getDischargeTimestamp() {
			return dischargeTimestamp;
		}
		public void setDischargeTimestamp(Timestamp dischargeTimestamp) {
			this.dischargeTimestamp = dischargeTimestamp;
		}
		private Timestamp admissionTimestamp;
	    private Timestamp dischargeTimestamp;
	  



}
