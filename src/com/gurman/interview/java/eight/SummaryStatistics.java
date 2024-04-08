package com.gurman.interview.java.eight;

import java.util.Arrays;
import java.util.List;

public class SummaryStatistics {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("A", 1, 40),
				new Student("C", 3,49),
				new Student("B", 2,19),
				new Student("F", 1, 40),
				new Student("B", 3,19),
				new Student("H", 2,19));
		
		//MAP to int has converted it to the input stream
		
		System.out.println("\n************** MAX *****************");
		System.out.println(list.stream().mapToInt(s->s.getAgeInteger()).summaryStatistics().getMax());
		
		System.out.println("\n************** MIN *****************");
		System.out.println(list.stream().mapToInt(s->s.getAgeInteger()).summaryStatistics().getMin());
		
		System.out.println("\n************** AVERAGE *****************");
		System.out.println(list.stream().mapToInt(s->s.getAgeInteger()).summaryStatistics().getAverage());
		
		System.out.println("\n************** COUNT *****************");
		System.out.println(list.stream().mapToInt(s->s.getAgeInteger()).summaryStatistics().getCount());
		
		System.out.println("\n************** SUM *****************");
		System.out.println(list.stream().mapToInt(s->s.getAgeInteger()).summaryStatistics().getSum());

	}

}
