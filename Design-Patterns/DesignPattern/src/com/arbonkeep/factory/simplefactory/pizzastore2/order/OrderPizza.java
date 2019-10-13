package com.arbonkeep.factory.simplefactory.pizzastore2.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂模式中的订购Pizza的类
public class OrderPizza {
	
	Pizza pizza = null;
	String orderType = "";//用户输入的Pizza类型
	
	//定义一个构造方法
	public OrderPizza() {
		while(true) {
			orderType = getType();//获取客户输入的类型
			
			pizza = SimpleFactory.createPizza(orderType);
			
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
				break;
			}else {
				System.out.println("订购失败，请重新输入pizza类型");
			}
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
