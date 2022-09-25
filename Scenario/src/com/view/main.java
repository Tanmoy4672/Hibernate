package com.view;

import com.model.Customer;
import com.model.OrderInfo;
import com.model.PacketProducts;
import com.model.RawProducts;

public class main {

	public main() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(1, "Tanmoy shome", 434274);
		customer.showCustomerDetails();

		System.out.println("-----------------------------------");

		OrderInfo order = new OrderInfo(1, "02/06/2022", "03:30");
		order.showOrderDetails();

		System.out.println("-----------------------------------");

		RawProducts product = new RawProducts();
		product.addProduct("Mango", 200, false);
		product.addProduct("Orange", 250, true);
		product.showProductDetails();
//		
		System.out.println("---------------------------------------------------");

		PacketProducts product1 = new PacketProducts();
		product1.addProduct("Chips", 200, "20/10/2022");
		product1.addProduct("Biscuit", 200, "20/11/2022");
		product1.showProductDetails();

		System.out.println("---------------------------------------------------");

		System.out.println("Total Raw Product : " + product.totalPriceCalculation());
		// product.totalPriceCalculation()
		System.out.println("Total Packet Product : " + product1.totalPriceCalculation());

//		
	}

}
