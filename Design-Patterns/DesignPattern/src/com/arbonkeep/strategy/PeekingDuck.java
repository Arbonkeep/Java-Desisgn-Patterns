package com.arbonkeep.strategy;
//����Ѽ��
public class PeekingDuck extends Duck {

	@Override
	public void display() {
		System.out.println("���Ǳ���Ѽ��");
		
	}

	@Override
	public void fly() {
		System.out.println("����Ѽ�Ӳ����");
	}
}
