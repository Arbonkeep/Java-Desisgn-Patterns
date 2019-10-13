package com.arbonkeep.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
	public abstract Pizza createPizza(String orderType);
	
	//���췽��
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
	
	//����һ�����������Ի�ȡ�ͻ�ϣ����������������
	public String getType() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�����붩�����������ͣ�");
			String str = br.readLine();
			return str;
		} catch(Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
}
