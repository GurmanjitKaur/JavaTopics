package com.gurman.topic.designpatterns.factory;

public class ShapeFactoryDemo {
	

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape("CIRcle");
		circle.draw();
		
		Shape rectangle = factory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = factory.getShape("square");
		square.draw();

	}

}
