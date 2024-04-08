package com.gurman.interview.java.eight;

import java.util.Objects;

public class Student {
	private String nameString;
	private Integer idInteger;
	private Integer ageInteger;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Integer getIdInteger() {
		return idInteger;
	}
	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}
	public Integer getAgeInteger() {
		return ageInteger;
	}
	public void setAgeInteger(Integer ageInteger) {
		this.ageInteger = ageInteger;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ageInteger, idInteger, nameString);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(ageInteger, other.ageInteger) && Objects.equals(idInteger, other.idInteger)
				&& Objects.equals(nameString, other.nameString);
	}
	public Student(String nameString, Integer idInteger, Integer ageInteger) {
		super();
		this.nameString = nameString;
		this.idInteger = idInteger;
		this.ageInteger = ageInteger;
	}
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", idInteger=" + idInteger + ", ageInteger=" + ageInteger + "]";
	}
	
	

}
