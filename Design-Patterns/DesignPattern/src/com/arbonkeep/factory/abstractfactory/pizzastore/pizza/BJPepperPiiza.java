package com.arbonkeep.factory.abstractfactory.pizzastore.pizza;

public class BJPepperPiiza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的胡椒披萨");
		System.out.println("为制作北京的胡椒披萨准备材料");
	}

}
