package com.gurman.interview.java.eight;

import java.util.List;
import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String department;
	private Address address;
	private List<String> subjects;
	private List<Vehicle> vehicles;
	
	public Employee(int id, String name, String department, Address address, List<String> subjects,
			List<Vehicle> vehicles) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
		this.subjects = subjects;
		this.vehicles = vehicles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address
				+ ", subjects=" + subjects + ", vehicles=" + vehicles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, department, id, name, subjects, vehicles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(subjects, other.subjects)
				&& Objects.equals(vehicles, other.vehicles);
	}
	
	

}
