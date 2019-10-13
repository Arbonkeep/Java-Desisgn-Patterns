package com.arbonkeep.factory.simplefactory.pizzastore2.order;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;

//�򵥹�����
public class SimpleFactory {
	//���ݴ����Pizza�����ͷ���Pizza����
	public static Pizza createPizza(String orderType) {
		Pizza pizza  = null;
		
		System.out.println("ʹ�þ�̬�����ഴ������");
		
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