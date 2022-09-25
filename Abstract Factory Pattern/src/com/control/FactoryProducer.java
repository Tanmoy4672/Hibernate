package com.control;

import com.exteNd.factory.RoundShapeFactory;
import com.exteNd.factory.ShapeFactory;
import com.interfacE.AbstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean roundded) {

		if (roundded) {
			return new RoundShapeFactory();
		} else {
			return new ShapeFactory();
		}

	}
}
