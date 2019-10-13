package com.arbonkeep.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}

}

//����ʽ����̬������

class Singleton {
	//1.������˽�л�
	private Singleton() {
		
	}
	
	//2.�����ڲ���������ʵ��
	private final static Singleton singleton = new Singleton();
	
	//3.�����ṩ��̬�Ĺ����Ļ�ȡ����ķ���
	public static Singleton getInstance() {
		return singleton;
	}
}
