package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//��������Ĺ����࣬�����ʵ��������
public interface AbsFactory {
	public Pizza createPizza(String orderType);
}
