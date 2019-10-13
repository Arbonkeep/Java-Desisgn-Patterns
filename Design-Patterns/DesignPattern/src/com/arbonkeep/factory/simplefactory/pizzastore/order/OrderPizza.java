package com.arbonkeep.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;
//原始的订购Pizza的类
public class OrderPizza {
	//构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//订购披萨的类型
		
		while(true) {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("GreekPizza");
			}else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("CheesePizza");
			}else if(orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("PepperPizza");
			}else {
				break;
			}
			
			//输出披萨得制作过程
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
