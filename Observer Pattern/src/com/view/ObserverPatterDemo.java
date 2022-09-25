package com.view;

import com.model.BinaryObserver;
import com.model.HexaObserver;
import com.model.OctalObserver;
import com.model.Subject;

public class ObserverPatterDemo {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state Change: 10");
		subject.setState(10);
	}
}
