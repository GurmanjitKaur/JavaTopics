package com.gurman.interview.designpatterns.abstractfactory;

public class FactoryProducer {

	public AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		}
		return new ShapeFactory();
	}

}
