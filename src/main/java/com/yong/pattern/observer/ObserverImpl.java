package com.yong.pattern.observer;

public class ObserverImpl implements Observer {

	@Override
	public void update(Subject s) {
		System.out.println(s.getState() + "   ----observerImpl");
	}
	

}
