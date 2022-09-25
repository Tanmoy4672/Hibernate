package com.view;

import com.model.User;

public class main {

	public static void main(String[] args) {

		User user = new User("Tanmoy Shome");
	//	user.name = "Tanmoy Shome";
		System.out.println(user.name);
		user.sayHello();
	}
}
