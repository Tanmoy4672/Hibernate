package com.control;

import java.util.Hashtable;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Square;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {

		Shape cachedShape = shapeMap.get(shapeId);

		return (Shape) cachedShape.colne();

	}

	// for each Shape run database query and create shape
	// shapeMap.put(Shapekey,shape)
	// for example, we are adding three shapes
	
	public static void loadCache() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square squre = new Square();
		squre.setId("2");
		shapeMap.put(squre.getId(), squre);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
