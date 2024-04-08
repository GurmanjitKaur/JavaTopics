package com.gurman.interview.java;

public class AbstractClassTest {

	public static void main(String[] args) {
		// calling a static method from abstract class
		E.operate1();

		// can't instantiate E as it is an abstract class
		// E e = new E();

		// Will call the overridden method from subclass F
		E e = new F();
		e.operate2();
		e.operate3();
	}

}

abstract class E implements InterfaceForAbstractClass{
	abstract void operate();

	/*
	 * Can be called directly as it is static but we can't create object of an
	 * abstract class
	 */
	public static void operate1() {
		System.out.println("This is a static method operate1 in abstract class E");
	}

	void operate2() {
		System.out.println("This is operate2 method from abstract E");
	}

	final void operate3() {
		System.out.println("This is FINAL operate3 method from abstract class E");
	}
}

class F extends E {

	@Override
	void operate() {
		System.out.println("This is overridden operate method from subclass F of abstract class E");
	}

	@Override
	void operate2() {
		System.out.println("This is operate2 method from subclass F");
	}

	/*
	 * This method is giving compile time error because it can't be overridden from
	 * the abstract superclass as it is a FINAL method there
	 * 
	 * void operate3() {
	 * 
	 * }
	 */
	
	public void operate4() {
		
	}

}
