package com.model;

import java.util.ArrayList;
import java.util.List;

public class RawProducts extends Products {

	private String productName;
	private float productsPrice;
	private Boolean freshnessInfo;

	@Override
	public void showProductDetails() {
		System.out.println("Raw Product Name        Product Price    Product Freshness");
		for (RawProducts proList : list) {
			System.out.println(proList.productName + "\t\t\t" + proList.productsPrice + "\t\t\t" + proList.freshnessInfo);
		}
	}

	public RawProducts(String productName, float productsPrice, Boolean freshnessInfo) {
		super();
		this.productName = productName;
		this.productsPrice = productsPrice;
		this.freshnessInfo = freshnessInfo;
	}

	public RawProducts() {
		// TODO Auto-generated constructor stub
	}

	List<RawProducts> list = new ArrayList<>();

	public void addProduct(String productName, float productPrice, boolean freshnessInfo) {
		// TODO Auto-generated method stu
		RawProducts product = new RawProducts(productName, productPrice, freshnessInfo);

		list.add(product);
	}

	@Override
	public float totalPriceCalculation() {
		float totalPrice = 0;
		for (RawProducts proList : list) {
			totalPrice += proList.productsPrice;
		}

		return totalPrice;
	}

}
