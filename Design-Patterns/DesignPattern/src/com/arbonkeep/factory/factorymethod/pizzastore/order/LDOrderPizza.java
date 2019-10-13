package com.arbonkeep.factory.factorymethod.pizzastore.order;

import com.arbonkeep.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.arbonkeep.factory.factorymethod.pizzastore.pizza.Pizza;
import com.arbonkeep.factory.factorymethod.pizzastore.pizza.LDPepperPizza;

public class LDOrderPizza extends OrderPizza{

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
			pizza.setName("Â×¶ØµÄÄÌÀÒÅûÈø");
		}else if(orderType.equals("pepper")){
			pizza = new LDPepperPizza();
			pizza.setName("Â×¶ØµÄºú½·ÅûÈø");
		}
		return pizza ;
	}
}
