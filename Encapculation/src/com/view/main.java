package com.view;

import com.model.Account;

public class main {
	public static void main(String[] args) {

		var account = new Account();
		account.deposit(50);
		account.withdraw(20);
		
		System.out.println(account.getBalance());
	}
}
