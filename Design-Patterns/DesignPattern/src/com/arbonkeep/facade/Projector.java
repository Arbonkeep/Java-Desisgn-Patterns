package com.arbonkeep.facade;
//ͶӰ����
public class Projector {
	private static Projector projector = new Projector();
	
	public static Projector getInstance() {
		return projector;
	}
	
	public void on() {
		System.out.println("��ͶӰ��");
	}
	public void off() {
		System.out.println("�ر�ͶӰ��");
	}
	public void zoom() {
		System.out.println("����ͶӰ��");
	}
	public void focus() {
		System.out.println("ͶӰ�ǵ���");
	}
}
