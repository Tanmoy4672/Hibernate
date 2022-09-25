package com.controler;

import design.pattern.Shape;

public class main {

	public static void main(String[] args) {
		
		ShapeFacory shapeSelection = new ShapeFacory();
		
		Shape shape1 = shapeSelection.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeSelection.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeSelection.getShape("TRIANGLE");
		shape3.draw();
	}
}
