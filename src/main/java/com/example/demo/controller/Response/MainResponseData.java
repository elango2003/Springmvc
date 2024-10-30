package com.example.demo.controller.Response;

public class MainResponseData {

	private boolean success;
	private String message;
	private Integer statusCode;
	private dataResponse data;
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public dataResponse getData() {
		return data;
	}
	public void setData(dataResponse data) {
		this.data = data;
	}
	

}
