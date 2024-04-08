package com.gurman.interview.comparator.comparable;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	String city;

	Student(int rollNo, String name, String city) {
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int compareTo(Student student) {
		if(this.city.compareTo(student.city)==0)
			return this.name.compareTo(student.name);
		return this.city.compareTo(student.city);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}
}
