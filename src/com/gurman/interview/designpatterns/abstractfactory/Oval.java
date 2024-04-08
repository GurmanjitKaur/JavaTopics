package com.gurman.interview.designpatterns.abstractfactory;

public class Oval implements Shape {

	@Override
	public void draw() {
		System.out.println("Rounded Oval draw");
	}

}
