package com.yong.pattern.visitor;

public class ElementImplA implements Element{

	@Override
	public void doSomething() {
		System.out.println("this is A");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	

}
