package com.arbonkeep.strategy;

public class ToyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("�������Ѽ");
		
	}
	
	public void quack() {
		System.out.println("���Ѽ�����");
	}
	
	public void swim() {
		System.out.println("���Ѽ������Ӿ");
	}
	
	public void fly() {
		System.out.println("���Ѽ�����");
	}

}