package com.arbonkeep.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
	public abstract Pizza createPizza(String orderType);
	
	//构造方法
	public OrderPizza() {
		Pizza pizza = null;
		String orderType = "";
		
		while(true) {
			orderType = getType();
			pizza = createPizza(orderType);
			
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		
	}
	
	//定义一个方法，可以获取客户希望订购的披萨种类
	public String getType() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入订购披萨的类型：");
			String str = br.readLine();
			return str;
		} catch(Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
}
