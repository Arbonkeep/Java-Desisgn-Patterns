package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.BJPepperPiiza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//声明具体的北京工厂类
public class BJFactory implements AbsFactory {
	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用抽象工厂模式");
		Pizza pizza = null;
		if	(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new BJPepperPiiza();
		}
		
		return pizza;
	}
}
