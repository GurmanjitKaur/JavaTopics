package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Natural order means it will sort on the basis of comparable present in Student class
public class ComparatorNaturalOrder_6 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));

		studentList.sort(Comparator.naturalOrder());
		System.out.println("Natural order means it will sort on the basis of comparable present in Student class");
		studentList.forEach(System.out::println);
		
	}
}
