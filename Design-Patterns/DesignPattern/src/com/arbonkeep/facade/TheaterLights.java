package com.arbonkeep.facade;
//�糡�ƹ�
public class TheaterLights {
	private static TheaterLights instance = new TheaterLights();
	
	public static TheaterLights getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("�򿪵ƹ�");
	}
	public void off() {
		System.out.println("�رյƹ�");
	}
	public void dim() {
		System.out.println("�����ƹ�");
	}
	public void bright() {
		System.out.println("�����ƹ�");
	}
}
