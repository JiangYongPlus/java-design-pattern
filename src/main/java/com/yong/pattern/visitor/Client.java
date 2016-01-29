package com.yong.pattern.visitor;

public class Client {

	public static void main(String[] args) {
		ElementImplA a = new ElementImplA();
		ElementImplB b = new ElementImplB();
		VisitorImpl v = new VisitorImpl();
		a.accept(v);
		b.accept(v);
	}

}
