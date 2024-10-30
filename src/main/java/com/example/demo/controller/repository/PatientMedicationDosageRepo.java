package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PatientMedicationDosage;

public interface PatientMedicationDosageRepo extends JpaRepository<PatientMedicationDosage, Integer>{

}
