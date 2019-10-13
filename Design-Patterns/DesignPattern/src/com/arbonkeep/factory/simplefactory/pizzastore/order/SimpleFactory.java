package com.arbonkeep.factory.simplefactory.pizzastore.order;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {
	//根据传入的Pizza的类型返回Pizza对象
	public Pizza createPizza(String orderType) {
		Pizza pizza  = null;
		
		System.out.println("使用简单工厂类创建对象");
		
		if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("CheesePizza");
		}else if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("GreekPizza");
		}else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("PepperPizza");
		}
		
		return pizza;
		
	}
}
