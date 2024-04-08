package com.gurman.interview.designpatterns.builder;

public class StudentBuilderDemo {

	public static void main(String[] args) {
		Student student = new Student.StudentBuilder().setCityString("city").build();
		System.out.println(student);

	}

}
