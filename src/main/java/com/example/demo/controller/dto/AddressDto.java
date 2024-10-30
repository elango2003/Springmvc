package com.example.demo.controller.dto;


public class AddressDto {
	private Integer addressId;
	private String addressType;
	private String country;
	private String state;
	private String city;
	private Integer zipCode;
	
	public AddressDto() {
		
	}
	public AddressDto(Integer addressId, String addressType, String country, String state, String city,
			Integer zipCode) {
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
		return "AddressDto [addressId=" + addressId + ", addressType=" + addressType + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
}
