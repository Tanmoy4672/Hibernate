package com.model;

public class Account {
	
	private float balance;

	public void deposit(float amount) {
		balance += amount;
	}
	
	public void withdraw(float amount) {
		balance -=amount;
	}
	
	public float getBalance() {
		return balance;
	}

//	public void setBalance(float balance) {
//		this.balance = balance;
//	}
//	
	
	

}
