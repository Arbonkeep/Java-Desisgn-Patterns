package com.arbonkeep.factory.factorymethod.pizzastore.order;

import com.arbonkeep.factory.factorymethod.pizzastore.order.OrderPizza;
import com.arbonkeep.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.arbonkeep.factory.factorymethod.pizzastore.pizza.BJPepperPiiza;
import com.arbonkeep.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
			pizza.setName("北京的奶酪披萨");
		}else if(orderType.equals("pepper")){
			pizza = new BJPepperPiiza();
			pizza.setName("北京的胡椒披萨");
		}
		return pizza ;
	}

}
