package com.hospital.patientmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.patientmanagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	long countByDischargeStatus(boolean dischargeStatus);

}
