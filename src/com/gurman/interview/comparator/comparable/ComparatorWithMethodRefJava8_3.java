package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithMethodRefJava8_3 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));

		Comparator<Student> cityComparator2 = Comparator.comparing(Student::getCity);
		//OR
		//Comparator<Student> cityComparator2 = (s,s1)->s.getCity().compareTo(s1.city);
		Collections.sort(studentList, cityComparator2);
		System.out.println("\n\nComparator based on RollNo in in JAVA 8 using Method reference");
		studentList.forEach(System.out::println);

		studentList.sort(Comparator.comparing(Student::getRollNo));
		System.out.println("\n\nComparator based on RollNo in in JAVA 8 using Method reference in better way");
		studentList.forEach(System.out::println);
	}
}
