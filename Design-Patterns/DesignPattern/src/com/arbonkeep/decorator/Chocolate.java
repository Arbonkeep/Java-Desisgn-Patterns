package com.arbonkeep.decorator;
//具体的装饰者，这里就是调味品
public class Chocolate extends Decorator {
	public Chocolate(Drink obj) {
		super(obj);
		setDesc("巧克力");
		setPrice(3.0f);
	}
}
