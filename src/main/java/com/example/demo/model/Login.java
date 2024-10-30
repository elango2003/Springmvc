package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@Column(name="login_id", length = 100)
	private Integer loginId;
	
	@Column(name="user_id_fk", length = 100)
	private Integer userIdFk;
	
	@Column(name="created_date", length = 200)
	private Date created_date;
	
	@Column(name="updated_date", length = 200)
	private Date updated_date;

	public Login() {
		
	}

	public Login(Integer loginId, Integer userIdFk, Date created_date, Date updated_date) {
		super();
		this.loginId = loginId;
		this.userIdFk = userIdFk;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public Integer getUserIdFk() {
		return userIdFk;
	}

	public void setUserIdFk(Integer userIdFk) {
		this.userIdFk = userIdFk;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userIdFk=" + userIdFk + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + "]";
	}


}
