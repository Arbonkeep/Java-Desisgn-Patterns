package com.arbonkeep.decorator;

public class Milk extends Decorator{
	public Milk(Drink obj) {
		super(obj);
		
		setDesc("ţ��");
		setPrice(4.0f);
	}
}
