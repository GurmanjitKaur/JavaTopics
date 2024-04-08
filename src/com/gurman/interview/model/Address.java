package com.gurman.interview.model;

public class Address implements Cloneable{

	String city;
	String country;
	Building building;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Address(String city, String country, Building building) {
		super();
		this.city = city;
		this.country = country;
		this.building = building;
	}

	@Override
	public String toString() {
		return "Address [city = " + city + ", country = " + country + ", \nbuilding = " + building + "]";
	}
	
	public Address clone() throws CloneNotSupportedException {
		Address address = (Address) super.clone();
		address.building = address.getBuilding().clone();
		return address;
	}
	
}
