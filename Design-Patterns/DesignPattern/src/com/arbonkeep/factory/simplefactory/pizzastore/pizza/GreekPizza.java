package com.arbonkeep.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
	@Override
	public void prepare() {
		System.out.println("为制作希腊披萨准备材料");
	}
}
