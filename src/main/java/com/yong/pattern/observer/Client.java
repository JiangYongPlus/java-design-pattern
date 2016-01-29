package com.yong.pattern.observer;

public class Client {

	public static void main(String[] args) {

		SubjectImpl sub = new SubjectImpl();
		sub.register(new Observer() {
			@Override
			public void update(Subject s) {
				System.out.println(s.getState() + "   ----inner class");
			}
		});
		sub.register(new ObserverImpl());
		sub.change("hello, new world!");
	}
}
