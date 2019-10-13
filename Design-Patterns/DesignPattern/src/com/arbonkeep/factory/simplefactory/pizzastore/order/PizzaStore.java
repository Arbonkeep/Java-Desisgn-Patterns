package com.arbonkeep.factory.simplefactory.pizzastore.order;
//相当于客户端
public class PizzaStore {
	public static void main(String[] args) {
		//普通方式订购pizza
		//new OrderPizza();
		
		//简单工厂模式订购pizza
		new OrderPizza2(new SimpleFactory());
		
	}
}
