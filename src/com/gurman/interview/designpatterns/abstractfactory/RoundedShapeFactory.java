package com.gurman.interview.designpatterns.abstractfactory;

public class RoundedShapeFactory implements AbstractFactory{
	
	public Shape getShape(String shapeType) {
		if("OVAL".equalsIgnoreCase(shapeType)) {
			return new Oval();
		}else if("Circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}
		return null;
	}
}
