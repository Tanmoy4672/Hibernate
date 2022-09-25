package com.model;

public class User {

	//field (attributes)
	public String name;
	
	
	public User(String name) {
		this.name = name;
	}
	//methods
	public void sayHello() {
		System.out.println("My name is "+name);
	}
}
