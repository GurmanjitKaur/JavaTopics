package com.gurman.interview.designpatterns.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory abstractFactory = factoryProducer.getFactory(true);
		Shape shape = abstractFactory.getShape("Circle");
		shape.draw();
		shape = abstractFactory.getShape("Oval");
		shape.draw();

		abstractFactory = factoryProducer.getFactory(false);
		shape = abstractFactory.getShape("Rectangle");
		shape.draw();
		shape = abstractFactory.getShape("Square");
		shape.draw();
	}

}
