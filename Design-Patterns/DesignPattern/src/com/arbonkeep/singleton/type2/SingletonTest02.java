package com.arbonkeep.singleton.type2;


public class SingletonTest02 {

	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

//����ʽ(��̬�����)
class Singleton {
	//1.˽�л����췽��
	private Singleton() {
		
	}
	
	//2.������̬��Ա����
	private static Singleton singleton;
	
	//3.�ھ�̬������й�������
	static {
		singleton = new Singleton();
	}
	
	//4.�����ṩ��̬�Ļ�ȡ����ķ���
	
	public static Singleton getInstance() {
		return singleton;
	}
}
