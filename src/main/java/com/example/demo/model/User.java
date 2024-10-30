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
@Table(name="user")
public class User {
	@Id
	@Column(name="user_id", length = 30)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name="name", length = 100)
	private String name;
	@Column(name="username", length = 100)
	private String userName;
	@Column(name="password", length = 100)
	private String password;
	@Column(name="age", length = 100)
	private Integer age;
	@Column(name="gender", length = 100)
	private String gender;
	@Column(name="date_of_birth", length = 100)
	private Date dateOfBirth;
	@Column(name="phone_no")
	private Long phoneNo;
	@Column(name="alternate_no")
	private Long alternateNo;
//	@Column(name="address_id", length = 100)
//	private Integer addressId;
//	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//	@JoinColumn(name="address_id",referencedColumnName = "address_id")
//	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="user_user_id")
	private List<Address> addressList;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="user_id_fk")
	private List<Treatment> treatmentList;
	

	public User() {
	
	}

	public User(Integer userId, String name, String userName, String password, Integer age, String gender,
			Date dateOfBirth, Long phoneNo, Long alternateNo, List<Address> addressList,
			List<Treatment> treatmentList) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.alternateNo = alternateNo;
		this.addressList = addressList;
		this.treatmentList = treatmentList;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public void setAlternateNo(Long alternateNo) {
		this.alternateNo = alternateNo;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public List<Treatment> getTreatmentList() {
		return treatmentList;
	}

	public void setTreatmentList(List<Treatment> treatmentList) {
		this.treatmentList = treatmentList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", age=" + age + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo
				+ ", alternateNo=" + alternateNo + ", addressList=" + addressList + ", treatmentList=" + treatmentList
				+ "]";
	}
	
	
	
}
