package com.hospital.patientmanagement.controller;

import com.hospital.patientmanagement.entity.Patient;
import com.hospital.patientmanagement.repository.PatientRepository;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PatientController{
	
	@Autowired
	private PatientRepository patientRepository;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("patients",patientRepository.findAll());
		return "home";
		
	}
	
	@GetMapping("/patients")
	public String listPatients(Model model) {
		model.addAttribute("patients", patientRepository.findAll());
		return "patients";
	}
	
	@GetMapping("/patients/search")
	public String SearchbyFormattedId(@RequestParam("id")String formattedId,Model model) {
		if(formattedId!=null && formattedId.startsWith("PT") || formattedId.startsWith("pt")) {
			String numberPart= formattedId.substring(2);
			try {
			Long id=Long.parseLong(numberPart);
			Patient p = patientRepository.findById(id).orElse(null);
			if(p!=null) {
				model.addAttribute("patients", Collections.singletonList(p));
			}else {
				model.addAttribute("message", "No patient found for given ID");
			}
			}
			catch(NumberFormatException e) {
				model.addAttribute("message","Invalid ID format");
				
			}
		}
		return "patients";
	}
	
   
    @GetMapping("/patients/new")
    public String showAddForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient-form";
    }

   
    @PostMapping("/patients/save")
    public String savePatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient);
        return "redirect:/patients";
    }

   
    
    @GetMapping("/patients/edit/{id}")
    public String editPatient(@PathVariable("id") Long id, Model model) {
        Patient p = patientRepository.findById(id).orElse(null);
        model.addAttribute("patient", p);
        return "patient-form";
    }

    
    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable("id") Long id) {
        patientRepository.deleteById(id);
        return "redirect:/patients";
    }

    
    @GetMapping("/patients/discharge/{id}")
    public String dischargePatient(@PathVariable("id") Long id) {
        Patient p = patientRepository.findById(id).orElse(null);
        if(p != null && !p.isDischargeStatus()) {
            p.setDischargeStatus(true);
            p.setDischargeTimestamp(java.time.LocalDateTime.now());
            patientRepository.save(p);
        }
        return "redirect:/patients";
    }
    @GetMapping("/patients/summary")
    public String patientSummary(Model model) {
        long totalInpatients   = patientRepository.countByDischargeStatus(false);
        long totalDischarged   = patientRepository.countByDischargeStatus(true);

        model.addAttribute("inpatients", totalInpatients);
        model.addAttribute("discharged", totalDischarged);
        return "summary";
    }
}







