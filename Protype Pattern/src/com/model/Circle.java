package com.model;

import com.control.Shape;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Drawing :: draw() method");
	}

}
