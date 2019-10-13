package com.arbonkeep.factory.abstractfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.arbonkeep.factory.abstractfactory.pizzastore.pizza.Pizza;

//����һ������pizza��
public class OrderPizza {
	AbsFactory factory;
	
	public OrderPizza(AbsFactory factory) {
		setFactroy(factory);
	}
	
	public void setFactroy(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";//�����û�����
		this.factory = factory;
		
		while(true) {
			orderType = getType();//��ȡ��Ӧ������
			//factory�����Ǳ����Ĺ���Ҳ�������׶صĹ���
			pizza = factory.createPizza(orderType);//��������

			if (pizza != null) {//�����ɹ�
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("����ʧ�ܣ������¶���");
			}
		}
	}
	
	//����һ���û��������͵ķ���
	public String getType() {
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����붩�����������ͣ�");
		String str = br.readLine();
		return str;
	}catch(Exception ex) {
		ex.printStackTrace();
		return "";
	}
	}
}
