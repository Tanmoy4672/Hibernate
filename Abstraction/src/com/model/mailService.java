package com.model;

public class mailService {

	public void sendMail() {
		connect(0);
		authenticate();
		//send mail
		disConnect();
	}
	
	private void connect(int timeout) {
		System.out.println("Connect.");
	}
	
	private void authenticate() {
		System.out.println("Authenticate.");
	}
	
	private void disConnect() {
		System.out.println("Disconnect.");
	}
}
