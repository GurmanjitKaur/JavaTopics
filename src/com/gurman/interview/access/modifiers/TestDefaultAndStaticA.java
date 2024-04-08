package com.gurman.interview.access.modifiers;

public interface TestDefaultAndStaticA {
	
	default void defaultMethod() {
		System.out.println("Print defaultMethod from TestDefaultAndStaticA interface");
	}
	
	static void staticMethod() {
		System.out.println("Static method from TestDefaultAndStaticA");
	}

	void overiddenMethod();
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
