package com.gurman.interview.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Slicing {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("A", 1, 40),
				new Student("C", 3,49),
				new Student("B", 2,19),
				new Student("F", 1, 40),
				new Student("B", 3,19),
				new Student("H", 2,19));
		//To find the 2nd max value, we can slice the list and give the limit as 1;
		
		
		List<Integer> intList=list.stream().map(Student::getAgeInteger).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(intList.stream().skip(1).limit(1).findFirst().get());

	}

}
