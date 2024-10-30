package com.example.demo.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Treatment;
import com.example.demo.model.patientMedication;

public interface PatientMedicationRepo extends JpaRepository<patientMedication, Integer>{
	@Query(value = "SELECT * FROM PATIENT_MEDICATION WHERE TREATMENT_ID_FK = ?1", nativeQuery = true)
	 List<patientMedication> getMedicationList(Integer treatment_id_fk);
	

}
