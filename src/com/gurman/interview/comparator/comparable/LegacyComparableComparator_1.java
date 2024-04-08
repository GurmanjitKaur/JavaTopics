package com.gurman.interview.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LegacyComparableComparator_1 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(6, "name3", "city1"));
		studentList.add(new Student(3, "name6", "city4"));
		studentList.add(new Student(2, "name5", "city4"));
		studentList.add(new Student(5, "name2", "city3"));
		studentList.add(new Student(4, "name1", "city2"));
		studentList.add(new Student(1, "name4", "city6"));
		// sorting using Comparable based on city, if city is same then sort on basis of
		// name
		// Collections.sort(studentList);
		studentList.forEach(System.out::println);

		// Comparator with anonymous class
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.name.compareTo(o1.name);
			}
		});
		System.out.println("\n\nComparator based on name in descending order");
		studentList.forEach(System.out::println);

		
		//TreeMap practice
		TreeMap<Student, Integer> map = new TreeMap<>();
		studentList.forEach(s -> map.put(s, s.getRollNo()));

		// System.out.println(map);

		for (Map.Entry<Student, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
		
		TreeMap<Student, Integer> map1 = new TreeMap<>((a,b)->a.getCity().compareTo(b.getCity()));
		System.out.println(map1);
		
	}

}
