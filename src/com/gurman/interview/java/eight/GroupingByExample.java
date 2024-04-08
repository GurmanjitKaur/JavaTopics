package com.gurman.interview.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("A", 1, 40),
				new Student("C", 3,49),
				new Student("B", 2,19),
				new Student("B", 1, 40),
				new Student("B", 3,19),
				new Student("C", 2,19));
		
		Map<Integer, List<Student>> map = getGroupByToList(list);
		printMap(map);
		
		TreeMap<Integer, List<Student>> treeMap = getGroupByToTreeMap(list);
		System.out.println("******************TreeMap****************");
		printMap(treeMap);
		
		TreeMap<Integer, Set<Student>> treeMapAndSet = getGroupByToTreeMapAndSet(list);
		System.out.println("******************TreeMap AND SET ****************");
		printMap(treeMapAndSet);
		
		//Create a map to find the frequency of each name
		Map<String, Long> frequencyMap = list.stream().map(Student::getNameString)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//OR Both are same
		list.stream().map(Student::getNameString)
		.collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println("******************Frequency Map ****************");
		printStringMap(frequencyMap);

	}

	private static void printMap(TreeMap<Integer, Set<Student>> treeMapAndSet) {
		treeMapAndSet.forEach((key, value) -> System.out.println(key + " " + value));
	}

	private static TreeMap<Integer, Set<Student>> getGroupByToTreeMapAndSet(List<Student> list) {
		return list.stream().collect(Collectors.groupingBy(Student::getAgeInteger,TreeMap::new,Collectors.toSet()));
	}

	private static TreeMap<Integer, List<Student>> getGroupByToTreeMap(List<Student> list) {
		return list.stream().collect(Collectors.groupingBy(s->s.getAgeInteger(),TreeMap::new,Collectors.toList()));
	}

	private static Map<Integer, List<Student>> getGroupByToList(List<Student> list) {
		return list.stream().collect(Collectors.groupingBy(s->s.getAgeInteger()));
	}
	
	private static void printMap(Map<Integer, List<Student>> map) {
		map.forEach((key, value) -> System.out.println(key + " " + value));
	}
	
	private static void printStringMap(Map<String,Long> map) {
		map.forEach((key, value) -> System.out.println(key + " " + value));
	}

}
