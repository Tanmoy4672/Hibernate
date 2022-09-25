package com.control;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Shape;
import com.model.Squre;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		//
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Squre();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
