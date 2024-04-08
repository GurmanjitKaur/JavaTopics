package com.gurman.interview.java;

public class Student {
	int rollNo;
	String name;
	String city;

	public Student(Builder builder) {
		super();
		this.rollNo = builder.rollNo;
		this.name = builder.name;
		this.city = builder.city;
	}

	public static class Builder {
		int rollNo;
		String name;
		String city;

		public static Builder newInstance() {
			return new Builder();
		}

		public Builder setRollNo(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}
