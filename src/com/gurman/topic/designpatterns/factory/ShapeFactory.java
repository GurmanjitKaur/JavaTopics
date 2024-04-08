package com.gurman.topic.designpatterns.factory;

public class ShapeFactory {

	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
}
