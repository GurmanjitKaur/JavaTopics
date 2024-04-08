package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLamdaJava8_2 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));

		// Comparator in JAVA 8 using Lambda expression
		Comparator<Student> cityComparator = (s1, s2) -> s1.getCity().compareTo(s2.getCity());
		Collections.sort(studentList, cityComparator);
		System.out.println("\n\nComparator based on city in in JAVA 8 using Lambda expression");
		studentList.forEach(System.out::println);

		Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("\n\nComparator based on name in in JAVA 8 using Lambda expression in second way");
		studentList.forEach(System.out::println);
	}
}
