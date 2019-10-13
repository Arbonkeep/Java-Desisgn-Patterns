package com.arbonkeep.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza{

	@Override
	public void prepare() {
		//setName("北京的奶酪披萨");
		System.out.println("为制作北京的奶酪披萨准备材料");
	}

}
