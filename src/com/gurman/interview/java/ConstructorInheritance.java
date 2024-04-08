package com.gurman.interview.java;

public class ConstructorInheritance {

	public static void main(String[] args) {
		System.out.println("Creating D instance");
		new D();
		
		System.out.println("Creating C instance");
		new C();
	}
}

class C {
	C() {
		System.out.println("This is constructor of C class");
	}
}

class D extends C {
	D() {
		super();
		System.out.println("This is constructor of D class");
	}
}
