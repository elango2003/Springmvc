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
@Table(name="treatment")
public class Treatment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="treatment_id")
	private Integer treatmentId;
	
	@Column(name="user_id_fk")
	private Integer userIdFk;
	
	@Column(name="summary", length = 500)
	private String summary;
	
	@Column(name="suggestion", length = 500)
	private String suggestion;
	
	@Column(name="diagnosis", length = 100)
	private String diagnosis;
	
	@Column(name="conclusion", length = 500)
	private String conclusion;
	
	@Column(name="appointment", length =20)
	private String appointmentDate;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="treatment_id_fk")
	private List<patientMedication> patientMedicationList;
	
	public Treatment() {
	
	}

	
	public Treatment(Integer treatmentId, Integer userIdFk, String summary, String suggestion, String diagnosis,
			String conclusion, String appointmentDate,
			List<patientMedication> patientMedicationList) {
		super();
		this.treatmentId = treatmentId;
		this.userIdFk = userIdFk;
		this.summary = summary;
		this.suggestion = suggestion;
		this.diagnosis = diagnosis;
		this.conclusion = conclusion;
		this.appointmentDate = appointmentDate;
		this.patientMedicationList = patientMedicationList;
	}


	public Integer getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Integer getUserIdFk() {
		return userIdFk;
	}

	public void setUserIdFk(Integer userIdFk) {
		this.userIdFk = userIdFk;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public List<patientMedication> getPatientMedicationList() {
		return patientMedicationList;
	}

	public void setPatientMedicationList(List<patientMedication> patientMedicationList) {
		this.patientMedicationList = patientMedicationList;
	}


	@Override
	public String toString() {
		return "Treatment [treatmentId=" + treatmentId + ", userIdFk=" + userIdFk + ", summary=" + summary
				+ ", suggestion=" + suggestion + ", diagnosis=" + diagnosis + ", conclusion=" + conclusion
				+ ", appointmentDate=" + appointmentDate + ", patientMedicationList=" + patientMedicationList + "]";
	}

	
}
