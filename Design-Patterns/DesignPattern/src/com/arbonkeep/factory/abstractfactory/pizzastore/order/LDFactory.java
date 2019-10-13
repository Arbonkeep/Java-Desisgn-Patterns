package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//����һ�����������׶ع���
public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("ʹ�ó��󹤳�ģʽ");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
