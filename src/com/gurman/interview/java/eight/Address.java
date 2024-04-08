package com.gurman.interview.java.eight;

public class Address {
	private String city;
	private String pin;
	private int houseNumber;
	
	public Address(String city, String pin, int houseNumber) {
		super();
		this.city = city;
		this.pin = pin;
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", houseNumber=" + houseNumber + "]";
	}
}
