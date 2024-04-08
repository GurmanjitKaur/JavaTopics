package com.gurman.interview.java;

import com.gurman.interview.access.modifiers.TestProtectedModifier;

public class ProtectedAMExtended extends TestProtectedModifier {

	public static void main(String[] args) {
		new ProtectedAMExtended()
				.protectedMethod("This is protected method called from outside packege from a subclass");
	}

}
