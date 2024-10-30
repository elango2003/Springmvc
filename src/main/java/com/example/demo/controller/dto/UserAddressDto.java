package com.example.demo.controller.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.model.Address;
import com.example.demo.model.Treatment;

public class UserAddressDto {
	private Integer userId;
	private String name;
	private String userName;
	private Integer age;
	private String gender;
	private Date dateOfBirth;
	private Long phoneNo;
	private Long alternateNo;
	private List<Address> address;
	public UserAddressDto() {
		
	}
	
	public UserAddressDto(Integer userId, String name, String userName, Integer age, String gender, Date dateOfBirth,
			Long phoneNo, Long alternateNo, List<Address> address) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.alternateNo = alternateNo;
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getAlternateNo() {
		return alternateNo;
	}
	public void setAlternateNo(Long aternateNo) {
		this.alternateNo = aternateNo;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserAddressDto [userId=" + userId + ", name=" + name + ", userName=" + userName + ", age=" + age
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", alternateNo="
				+ alternateNo + ", address=" + address + "]";
	}
	
	

	

}
