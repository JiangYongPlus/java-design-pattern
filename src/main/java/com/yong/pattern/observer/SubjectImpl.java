package com.yong.pattern.observer;

public class SubjectImpl extends Subject{
	
	public void change(String newState) {
		state = newState;
		notifyObservers();
	}
}
