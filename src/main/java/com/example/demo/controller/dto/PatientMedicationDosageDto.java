package com.example.demo.controller.dto;

import java.sql.Date;

public class PatientMedicationDosageDto {
	
	private Integer treatmentId;
	private Integer medicationFkId;
	private boolean morning;
	private boolean afternoon;
	private boolean night;
	private boolean before;
	private boolean after;
	public PatientMedicationDosageDto() {	
	}
	
	public PatientMedicationDosageDto(Integer treatmentId, Integer medicationFkId, boolean morning, boolean afternoon,
			boolean night, boolean before, boolean after, Date createdAt, Date updateddAt) {
		super();
		this.treatmentId = treatmentId;
		this.medicationFkId = medicationFkId;
		this.morning = morning;
		this.afternoon = afternoon;
		this.night = night;
		this.before = before;
		this.after = after;
		
	}

	@Override
	public String toString() {
		return "PatientMedicationDosageDto [treatmentId=" + treatmentId + ", medicationFkId=" + medicationFkId
				+ ", morning=" + morning + ", afternoon=" + afternoon + ", night=" + night + ", before=" + before
				+ ", after=" + after + "]";
	}

	public Integer getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Integer getMedicationFkId() {
		return medicationFkId;
	}

	public void setMedicationFkId(Integer medicationFkId) {
		this.medicationFkId = medicationFkId;
	}

	public boolean isMorning() {
		return morning;
	}

	public void setMorning(boolean morning) {
		this.morning = morning;
	}

	public boolean isAfternoon() {
		return afternoon;
	}

	public void setAfternoon(boolean afternoon) {
		this.afternoon = afternoon;
	}

	public boolean isNight() {
		return night;
	}

	public void setNight(boolean night) {
		this.night = night;
	}

	public boolean isBefore() {
		return before;
	}

	public void setBefore(boolean before) {
		this.before = before;
	}

	public boolean isAfter() {
		return after;
	}

	public void setAfter(boolean after) {
		this.after = after;
	}


	

}
