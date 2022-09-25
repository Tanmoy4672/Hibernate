package com.model;

import com.control.Shape;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Drawing :: draw() method");
	}

}
