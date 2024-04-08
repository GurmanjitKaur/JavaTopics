package com.gurman.interview.designpatterns.builder;

public class Student {

	private  String idString;
	private  String nameString;
	private  String cityString;

	public Student(StudentBuilder studentBuilder) {
		this.idString = studentBuilder.idString;
		this.nameString = studentBuilder.nameString;
		this.cityString = studentBuilder.cityString;
	}

	public String getIdString() {
		return idString;
	}

	public String getNameString() {
		return nameString;
	}

	public String getCityString() {
		return cityString;
	}
	

	@Override
	public String toString() {
		return "Student [idString=" + idString + ", nameString=" + nameString + ", cityString=" + cityString + "]";
	}


	public static class StudentBuilder {
		private String idString;
		private String nameString;
		private String cityString;
		
		

		public StudentBuilder() {

		}

		public StudentBuilder setIdString(String idString) {
			this.idString = idString;
			return this;
		}

		public StudentBuilder setNameString(String nameString) {
			this.nameString = nameString;
			return this;
		}

		public StudentBuilder setCityString(String cityString) {
			this.cityString = cityString;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}
}
