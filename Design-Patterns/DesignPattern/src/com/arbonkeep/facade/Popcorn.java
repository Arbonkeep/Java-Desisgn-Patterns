package com.arbonkeep.facade;
//���׻���
public class Popcorn {
	private static Popcorn popcorn = new Popcorn();
	
	public static Popcorn getInstance() {
		return popcorn;
	}
	
	public void on() {
		System.out.println("����������");
	}
	public void off() {
		System.out.println("�ر���������");
	}
	public void pop() {
		System.out.println("�������׻�");
	}
	
	
}
