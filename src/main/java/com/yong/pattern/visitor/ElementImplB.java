package com.yong.pattern.visitor;

public class ElementImplB implements Element{

	@Override
	public void doSomething() {
		System.out.println("this is B");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}