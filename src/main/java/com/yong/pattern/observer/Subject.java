package com.yong.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();
	String state = "hello, world";
	
	public String getState() {
		return state;
	}
	
	public void register(Observer o) {
		observers.add(o);
	}
	
	public void deRegister(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
