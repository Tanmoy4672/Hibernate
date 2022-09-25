package com.model;

public class BinaryObserver extends Observer{

	
	
	public BinaryObserver(Subject subject) {
		
		this.subject = subject;
		this.subject.addSubject(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
		
	}

}
