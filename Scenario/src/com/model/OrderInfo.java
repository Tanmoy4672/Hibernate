package com.model;

public class OrderInfo {

	private int orderNo;
	private String date;
	private String time;

	public OrderInfo(int orderNo, String date, String time) {
		super();
		this.orderNo = orderNo;
		this.date = date;
		this.time = time;
	}

	public void showOrderDetails() {
		System.out.println("Order No : " + orderNo);
		System.out.println("Date : " + date);
		System.out.println("Time : " + time);
	}

}
