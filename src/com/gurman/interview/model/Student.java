package com.gurman.interview.model;

public class Student implements Cloneable {
	String name;
	Integer rollNumber;
	int position;
	Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(String name, Integer rollNumber, int position, Address address) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.position = position;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", rollNumber = " + rollNumber + ", position = " + position
				+ ", \naddress = " + address + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.address = student.getAddress().clone();
		return student;
	}
}
