package com.yong.pattern.visitor;

public class VisitorImpl implements Visitor{

	@Override
	public void visit(ElementImplA a) {
		a.doSomething();
	}

	@Override
	public void visit(ElementImplB b) {
		b.doSomething();
	}
	
}
