package com.gurman.interview.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("A", 1, 40),
				new Student("C", 3,49),
				new Student("B", 2,19),
				new Student("B", 1, 40),
				new Student("B", 3,19),
				new Student("C", 2,19),
				new Student(null, 2,19),
				new Student(null, 2,19),null);
		Optional.ofNullable(list.get(8)).ifPresent(Student::toString);
		
		
	}

}
