package com.model;

public class Customer {
	
	private int customerId;
	private String name;
	private int phone;
	
	
	public Customer(int customerId, String name, int phone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
	}
	
	
	public void showCustomerDetails() {
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+name);
		System.out.println("Phone: "+phone);
	}


}
