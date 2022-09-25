package com.exteNd.factory;

import com.inherhit.shape.RoundRectangle;
import com.inherhit.shape.RoundSquare;
import com.interfacE.AbstractFactory;
import com.interfacE.Shape;

public class RoundShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundSquare();
		}

		return null;
	}

}
