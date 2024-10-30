package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;

	@Column(name = "address_type", length = 200)
	private String addressType;
	@Column(name = "country", length = 200)
	private String country;
	@Column(name = "state", length = 100)
	private String state;
	@Column(name = "city", length = 100)
	private String city;
	@Column(name = "zip_code", length = 100)
	private Integer zipCode;

	public Address() {

	}

	public Address(Integer addressId, String addressType, String country, String state, String city, Integer zipCode) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", country=" + country + ", state="
				+ state + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
