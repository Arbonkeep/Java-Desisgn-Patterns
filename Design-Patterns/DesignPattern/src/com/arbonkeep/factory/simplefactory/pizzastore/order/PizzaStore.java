package com.arbonkeep.factory.simplefactory.pizzastore.order;
//�൱�ڿͻ���
public class PizzaStore {
	public static void main(String[] args) {
		//��ͨ��ʽ����pizza
		//new OrderPizza();
		
		//�򵥹���ģʽ����pizza
		new OrderPizza2(new SimpleFactory());
		
	}
}
