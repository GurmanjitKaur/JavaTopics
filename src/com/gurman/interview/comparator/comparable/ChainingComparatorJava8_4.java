package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//i.e. sorting based on multiple fields
public class ChainingComparatorJava8_4 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));

		Collections.sort(studentList, Comparator.comparing(Student::getCity).thenComparing(Student::getName));
		System.out.println(
				"Comparator based on City, if city is same then based on name in JAVA 8 using Method reference");
		studentList.forEach(System.out::println);
		
		
		
		Collections.sort(studentList, Comparator.comparing(s1->s1.getName()));

	}

}


