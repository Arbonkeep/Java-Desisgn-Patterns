package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//声明抽象的工厂类，具体的实现在子类
public interface AbsFactory {
	public Pizza createPizza(String orderType);
}
