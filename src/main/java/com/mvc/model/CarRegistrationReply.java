package com.mvc.model;

public class CarRegistrationReply {
	
	String name; 
    String model; 
    int year; 
    float price;
    String registrationNumber;
    String registrationStatus;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

}
