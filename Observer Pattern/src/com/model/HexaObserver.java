package com.model;

public class HexaObserver extends Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Hexadecimal String: " + Integer.toHexString(subject.getState()));
	}

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.addSubject(this);
		// TODO Auto-generated constructor stub
	}

}
