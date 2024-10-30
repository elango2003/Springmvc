package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_medication_dosage")
public class PatientMedicationDosage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_dosage", length = 100)
	private Integer dosageId;

	@Column(name = "medication_fk_id", length = 100)
	private Integer medicationFkId;

	@Column(name = "morning", length = 100)
	private boolean morning;

	@Column(name = "afternoon", length = 100)
	private boolean afternoon;

	@Column(name = "night", length = 100)
	private boolean night;

//	@Column(name = "before", length = 100)
//	private boolean before;

	@Column(name = "after", length = 100)
	private boolean after;
//		
//		@Column(name="created_at", length = 100)
//		private Date createdAt;
//		
//		@Column(name="updated_at", length = 100)
//		private Date updateddAt;

	public PatientMedicationDosage() {

	}

	public PatientMedicationDosage(Integer dosageId, Integer medicationFkId, boolean morning, boolean afternoon,
			boolean night, boolean before, boolean after, Date createdAt, Date updateddAt) {
		super();
		this.dosageId = dosageId;
		this.medicationFkId = medicationFkId;
		this.morning = morning;
		this.afternoon = afternoon;
		this.night = night;
//		this.before = before;
			this.after = after;
//			this.createdAt = createdAt;
//			this.updateddAt = updateddAt;
	}

	public Integer getDosageId() {
		return dosageId;
	}

	public void setDosageId(Integer treatmentId) {
		this.dosageId = treatmentId;
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

	

	public boolean isAfter() {
		return after;
	}

	public void setAfter(boolean after) {
		this.after = after;
	}

	@Override
	public String toString() {
		return "PatientMedicationDosage [dosageId=" + dosageId + ", medicationFkId=" + medicationFkId + ", morning="
				+ morning + ", afternoon=" + afternoon + ", night=" + night + ", after=" + after + "]";
	}

	
}
//
//
//
//		public Date getCreatedAt() {
//			return createdAt;
//		}
//
//		public void setCreatedAt(Date createdAt) {
//			this.createdAt = createdAt;
//		}
//
//		public Date getUpdateddAt() {
//			return updateddAt;
//		}
//
//		public void setUpdateddAt(Date updateddAt) {
//			this.updateddAt = updateddAt;
//		}
//
//
//
