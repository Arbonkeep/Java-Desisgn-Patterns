package com.arbonkeep.facade;
//DVD��
public class DVDPlayer {
	//ʹ�ö���ʽ����ģʽ
	private static DVDPlayer instance = new DVDPlayer();
	
	public static DVDPlayer getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("��DVD");
	}
	
	public void off() {
		System.out.println("�ر�DVD");
	}
	
	public void play() {
		System.out.println("���ڲ��ŵ�Ӱ");
	}
	
	public void pause() {
		System.out.println("ֹͣ����");
	}
	
	public void end() {
		System.out.println("��������");
	}
}

