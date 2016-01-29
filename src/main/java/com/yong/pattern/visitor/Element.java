package com.yong.pattern.visitor;

public interface Element {
	
	void doSomething();
	
	void accept(Visitor visitor);

}
