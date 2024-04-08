package com.gurman.interview.designpatterns.abstractfactory;

public class ShapeFactory implements AbstractFactory{
	public Shape getShape(String shapeType) {
		if("Rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}else if("Square".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
}
