package com.arbonkeep.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;
//ԭʼ�Ķ���Pizza����
public class OrderPizza {
	//������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//��������������
		
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
			
			//�����������������
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
