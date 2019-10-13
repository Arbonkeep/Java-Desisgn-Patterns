package com.arbonkeep.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.simplefactory.pizzastore.pizza.Pizza;

//�򵥹���ģʽ�еĶ���Pizza����
public class OrderPizza2 {
	//����һ������
	SimpleFactory simpleFactory;
	
	Pizza pizza = null;
	
	//����һ�����췽��
	public OrderPizza2(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	//����һ�����ù����ķ���
	private void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";//�û������Pizza����
		
		this.simpleFactory = simpleFactory;//���ü򵥻���������
		
		while(true) {
			orderType = getType();//��ȡ�ͻ����������
			
			pizza = this.simpleFactory.createPizza(orderType);//���÷�������Pizza����
			
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
