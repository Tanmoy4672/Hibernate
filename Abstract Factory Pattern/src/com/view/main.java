package com.view;

import com.control.FactoryProducer;
import com.interfacE.AbstractFactory;
import com.interfacE.Shape;

public class main {

	public static void main(String[] args) {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();

		// second shape
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();

	}
}
