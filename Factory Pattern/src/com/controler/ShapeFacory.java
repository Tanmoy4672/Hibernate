package com.controler;

import design.pattern.Circle;
import design.pattern.Rectangle;
import design.pattern.Shape;
import design.pattern.Triangle;

public class ShapeFacory {

	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}
}
