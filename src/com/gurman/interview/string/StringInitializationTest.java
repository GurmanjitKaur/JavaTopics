package com.gurman.interview.string;

public class StringInitializationTest {
	public static void main(String[] args) {
		//It creates one string in memory, if there is already a CAT string present in the pool
		//else it will create two strings, one in memory and one in heap
		//new operator creates a string in both pool(if not present already) and memory
		String string1 = new String("Cat");
		
		//it created one string Cat in the pool
		String string2 = "Cat";
		
		//It has not created any string in the memory as Cat string is already present in the pool
		String string3 = "Cat";
		
		System.out.println("string1==string2 "+string1==string2);
		System.out.println("string3==string2 "+string3==string2);
	}

}
