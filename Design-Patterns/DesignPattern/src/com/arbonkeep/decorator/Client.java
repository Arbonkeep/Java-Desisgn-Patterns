package com.arbonkeep.decorator;

public class Client {
	public static void main(String[] args) {
		//װ����ģʽ�¶�����2���ɿ�����һ��ţ�̵�LongBlack
		
		//1.��һ��LongBlack(��һ�ݵ�Ʒ����)
		Drink order = new LongBlack();
		System.out.println("һ����ʽ���ȵķ���=" + order.cost() );
		System.out.println("һ����ʽ���ȵ�����=" + order.getDesc() );
		
		//2.��һ��ţ��
		order = new Milk(order);
		
		System.out.println("order + һ��ţ�̵ķ���=" + order.cost() );
		System.out.println("order + һ��ţ�̵�����=" + order.getDesc() );
		
		//3.��һ���ɿ���
		order = new Chocolate(order);
		
		System.out.println("order + һ��ţ�� + һ���ɿ����ķ���=" + order.cost() );
		System.out.println("order + һ��ţ�� + һ���ɿ���������=" + order.getDesc() );
		
		//4.�ټ�һ���ɿ���
		order = new Chocolate(order);
		
		System.out.println("order + һ��ţ�� + 2���ɿ����ķ���=" + order.cost() );
		System.out.println("order + һ��ţ�� + 2���ɿ���������=" + order.getDesc() );
		
		
	}
}
