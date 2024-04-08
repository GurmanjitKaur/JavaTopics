package com.gurman.interview.java;

public class FunctionalInterfaceP {

	@FunctionalInterface
	interface NoParameter {
		void operate();
	}

	@FunctionalInterface
	interface SingleParameter {
		int operate(int a);
	}

	@FunctionalInterface
	interface MultipleParameter {
		int operate(int a, int b);
	}

	public void operation() {
		NoParameter noParameter = () -> System.out.println("This is no parameter FI");
		noParameter.operate();

		SingleParameter singleParameter = (a) -> a * 5;
		System.out.println("This is single parameter FI with output: " + singleParameter.operate(6));

		MultipleParameter multipleParameter = (a, b) -> a * b;
		System.out.println("This is multiple parameter FI with output: " + multipleParameter.operate(7, 3));
	}

}
