package com.example.demo.controller.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.model.patientMedication;

public class TreatmentDto {
	private Integer treatmentId;
	private Integer userIdFk;
	private String summary;
	private String suggestion;
	private String diagnosis;
	private String conclusion;
	private String appointmentDate;
	private List<patientMedication> patientMedicationList;
	
	public TreatmentDto() {
	
	}
	public TreatmentDto(Integer treatmentId, Integer userIdFk, String summary, String suggestion, String diagnosis,
			String conclusion, String appointmentDate, List<patientMedication> patientMedicationList) {
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
		return "TreatmentDto [treatmentId=" + treatmentId + ", userIdFk=" + userIdFk + ", summary=" + summary
				+ ", suggestion=" + suggestion + ", diagnosis=" + diagnosis + ", conclusion=" + conclusion
				+ ", appointmentDate=" + appointmentDate + ", patientMedicationList=" + patientMedicationList + "]";
	}


}
