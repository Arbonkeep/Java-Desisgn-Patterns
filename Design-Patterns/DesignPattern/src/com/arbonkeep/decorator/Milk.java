package com.arbonkeep.decorator;

public class Milk extends Decorator{
	public Milk(Drink obj) {
		super(obj);
		
		setDesc("еёдл");
		setPrice(4.0f);
	}
}
