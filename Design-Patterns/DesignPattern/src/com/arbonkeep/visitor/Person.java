package com.arbonkeep.visitor;

public abstract class Person {
	//提供一个方法，用于访问者进行访问
	public abstract void accept(Action action);
}
