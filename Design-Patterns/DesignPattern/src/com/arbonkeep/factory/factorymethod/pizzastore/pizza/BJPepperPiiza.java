package com.arbonkeep.factory.factorymethod.pizzastore.pizza;

public class BJPepperPiiza extends Pizza {

	@Override
	public void prepare() {
		//setName("北京的胡椒披萨");
		System.out.println("为制作北京的胡椒披萨准备材料");
	}

}
