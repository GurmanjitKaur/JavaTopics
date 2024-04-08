package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparatorJava8Reverse_5 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));
		
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(6, "name3", "city1"), 7);
		map.put(new Student(3, "name6", "city4"), 9);
		map.put(new Student(2, "name5", "city4"), 3);
		map.put(new Student(5, "name2", "city3"), 4);
		map.put(new Student(4, "name1", "city2"), 5);
		map.put(new Student(1, "name4", "city6"), 6);

		Map<Student, Integer> sortedByCount = map.entrySet()
                .stream()
                .sorted((s1,s2)->s1.getKey().getName().compareTo(s2.getKey().getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedByCount);
		
		Collections.sort(studentList,
				Comparator.comparing(Student::getCity).reversed().thenComparing(Student::getName));
		System.out.println(
				"Comparator based on City in descending order, \nif city is same then based on name in ascending \norder in JAVA 8 using Method reference\n");
		studentList.forEach(System.out::println);

	}
}
