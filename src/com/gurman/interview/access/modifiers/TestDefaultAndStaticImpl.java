package com.gurman.interview.access.modifiers;

public class TestDefaultAndStaticImpl implements TestDefaultAndStaticA{

	public static void main(String[] args) {
		TestDefaultAndStaticA.staticMethod();
		TestDefaultAndStaticImpl impl =new TestDefaultAndStaticImpl();
		impl.defaultMethod();
		impl.overiddenMethod();
		impl.isNull("abc");

	}

	@Override
	public void overiddenMethod() {
		System.out.println("Overidden Method");
		
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("Print defaultMethod from TestDefaultAndStatic impl");
	}
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

}
