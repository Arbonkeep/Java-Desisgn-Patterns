package com.arbonkeep.strategy;

public abstract class Duck {
	//��ʾѼ�ӵ���Ϣ
	public abstract void display();
	
	public void quack() {
		System.out.println("Ѽ�Ӹ¸½�");
	}
	
	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ");
	}
	
	public void fly() {
		System.out.println("Ѽ�ӻ��");
	}
}