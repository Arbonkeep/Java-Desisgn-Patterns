package com.arbonkeep.facade;
//������
public class Stereo {
    private static Stereo instance = new Stereo();
	
	public static Stereo getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("������");
	}
	public void off() {
		System.out.println("�ر�����");
	}
	public void zoom() {
		System.out.println("������������");
	}
	
}
