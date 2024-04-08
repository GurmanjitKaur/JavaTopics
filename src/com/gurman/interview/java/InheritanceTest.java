package com.gurman.interview.java;

public class InheritanceTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		B.operate();
		
		
		/*If static, it will operate the A class function, 
		*if non-static it will call the B class function
		*
		*However this is not the correct way to call the static method,
		*It should be called with the name of the class as it is there in the above statement
		*/
		A a = new B();
		a.operate();

	}

}


class A{
	public static void operate() {
		System.out.println("operate() in A");
	}
}

class B extends A{
	public static void operate() {
		System.out.println("operate() in B");
	}
}
