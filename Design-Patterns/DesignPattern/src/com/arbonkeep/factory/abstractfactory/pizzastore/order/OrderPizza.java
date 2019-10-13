package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//声明一个订购pizza类
public class OrderPizza {
	AbsFactory factory;
	
	public OrderPizza(AbsFactory factory) {
		setFactroy(factory);
	}
	
	public void setFactroy(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";//用于用户输入
		this.factory = factory;
		
		while(true) {
			orderType = getType();//获取对应的类型
			//factory可能是北京的工厂也可能是伦敦的工厂
			pizza = factory.createPizza(orderType);//工厂制作

			if (pizza != null) {//订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购失败，请重新订购");
			}
		}
	}
	
	//声明一个用户输入类型的方法
	public String getType() {
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入订购的披萨类型：");
		String str = br.readLine();
		return str;
	}catch(Exception ex) {
		ex.printStackTrace();
		return "";
	}
	}
}
