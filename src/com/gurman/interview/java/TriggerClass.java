package com.gurman.interview.java;

import com.gurman.interview.access.modifiers.TestProtectedModifier;

public class TriggerClass extends TestProtectedModifier{

	public static void main(String[] args) {
		System.out.println("**** FUNCTIONAL INTERFACE ****");
		FunctionalInterfaceP interfaceP = new FunctionalInterfaceP();
		interfaceP.operation();
	}
}
