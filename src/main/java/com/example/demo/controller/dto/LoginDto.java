package com.example.demo.controller.dto;

import java.sql.Date;

public class LoginDto {

	private Integer loginId;
	private Integer userIdFk;
	private Date created_date;
	private Date updated_date;
	public LoginDto() {
		
	}
	public LoginDto(Integer loginId, Integer userIdFk, Date created_date, Date updated_date) {
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
		return "LoginDto [loginId=" + loginId + ", userIdFk=" + userIdFk + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + "]";
	}
	
	
}
