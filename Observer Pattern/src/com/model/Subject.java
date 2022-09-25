package com.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state;
	private List<Observer> observer = new ArrayList<Observer>();

	public void addSubject(Observer obser) {
		observer.add(obser);
	}

	public void notifyAllOvserver() {
		for (Observer observ : observer) {
			observ.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllOvserver();
	}

}
