package com.model;

import com.control.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle:: Draw() method");
	}

}
