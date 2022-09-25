package com.exteNd.factory;

import com.inherhit.shape.Rectangle;
import com.inherhit.shape.Square;
import com.interfacE.AbstractFactory;
import com.interfacE.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		//
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
