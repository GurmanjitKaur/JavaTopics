package com.gurman.interview.designpatterns.abstractfactory;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rounded Circle draw");
	}

}
