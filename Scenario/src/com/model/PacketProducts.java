package com.model;

import java.util.ArrayList;
import java.util.List;

public class PacketProducts extends Products {
	private String productName;
	private float productsPrice;
	private String expairyDate;

	@Override
	public void showProductDetails() {
		System.out.println("Packet Product Name        Product Price    Product Expiry Date");
		for (PacketProducts proList : list) {
			System.out.println(proList.productName + "\t\t\t" + proList.productsPrice + "\t\t\t" + proList.expairyDate);
		}

	}

	public PacketProducts(String productName, float productsPrice, String expairyDate) {
		super();
		this.productName = productName;
		this.productsPrice = productsPrice;
		this.expairyDate = expairyDate;
	}

	public PacketProducts() {
		// TODO Auto-generated constructor stub
	}

	List<PacketProducts> list = new ArrayList<>();

	public void addProduct(String productName, float productPrice, String expiryDate) {
		// TODO Auto-generated method stu
		PacketProducts product = new PacketProducts(productName, productPrice, expiryDate);

		list.add(product);
	}

	@Override
	public float totalPriceCalculation() {
		// TODO Auto-generated method stub
		float totalPrice = 0;
		for (PacketProducts proList : list) {
			totalPrice += proList.productsPrice;
		}

		return totalPrice;

		
	}

}
