package com.gurman.interview.access.modifiers;

public class TriggerClass {

	public static void main(String[] args) {
		TestProtectedModifier testProtectedModifier = new TestProtectedModifier();
		testProtectedModifier.protectedMethod("This is protected method from within package");
	}

}
