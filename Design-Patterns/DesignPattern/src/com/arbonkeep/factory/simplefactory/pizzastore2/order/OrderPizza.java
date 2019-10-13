package com.arbonkeep.factory.simplefactory.pizzastore2.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;

//�򵥹���ģʽ�еĶ���Pizza����
public class OrderPizza {
	
	Pizza pizza = null;
	String orderType = "";//�û������Pizza����
	
	//����һ�����췽��
	public OrderPizza() {
		while(true) {
			orderType = getType();//��ȡ�ͻ����������
			
			pizza = SimpleFactory.createPizza(orderType);
			
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
				break;
			}else {
				System.out.println("����ʧ�ܣ�����������pizza����");
			}
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
