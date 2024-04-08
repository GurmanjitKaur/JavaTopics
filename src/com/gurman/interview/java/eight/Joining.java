package com.gurman.interview.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("A", 1, 40),
				new Student("C", 3,49),
				new Student("B", 2,19),
				new Student("F", 1, 40),
				new Student("B", 3,19),
				new Student("H", 2,19));
		
		String a = list.stream().map(Student::getNameString).collect(Collectors.joining(","));
		System.out.println(a);

	}

}
