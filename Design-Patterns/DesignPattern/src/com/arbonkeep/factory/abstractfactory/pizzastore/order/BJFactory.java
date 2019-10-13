package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.BJPepperPiiza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//��������ı���������
public class BJFactory implements AbsFactory {
	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("ʹ�ó��󹤳�ģʽ");
		Pizza pizza = null;
		if	(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new BJPepperPiiza();
		}
		
		return pizza;
	}
}
