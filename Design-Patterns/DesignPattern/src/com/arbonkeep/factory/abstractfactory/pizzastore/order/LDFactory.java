package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//声明一个具体子类伦敦工厂
public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("使用抽象工厂模式");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
