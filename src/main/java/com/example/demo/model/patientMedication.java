package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_medication")
public class patientMedication {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="medication_id", length = 100)
	private Integer medicationId;
	
	@Column(name="treatment_id_fk", length = 200)
	private Integer treatmentId;
	
	@Column(name="medicine", length = 200)
	private String medicine;
	
	@Column(name="dosage", length = 200)
	private String dosage;

	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="medication_fk_id")
	private List<PatientMedicationDosage> timeList;
	
	public patientMedication() {

	}

	public patientMedication(Integer medicationId, Integer treatmentId, String medicine, String dosage, List<PatientMedicationDosage> timeList) {
		super();
		this.medicationId = medicationId;
		this.treatmentId = treatmentId;
		this.medicine = medicine;
		this.dosage = dosage;
		this.timeList = timeList;
	}

	public Integer getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(Integer medicationId) {
		this.medicationId = medicationId;
	}

	public Integer getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	
	public List<PatientMedicationDosage> getTimeList() {
		return timeList;
	}

	public void setTimeList(List<PatientMedicationDosage> timeList) {
		this.timeList = timeList;
	}

	@Override
	public String toString() {
		return "patientMedication [medicationId=" + medicationId + ", treatmentId=" + treatmentId + ", medicine="
				+ medicine + ", dosage=" + dosage + ", timeList=" + timeList + "]";
	}

		

}
