package com.arbonkeep.singleton.type4;

public class SingletonTest04 {

	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());		

	}

}
//����ʽ(�̰߳�ȫ��ͬ������)
class Singleton {
	//1.������Ա����
	private static Singleton singleton;
	
	//2.˽�л����췽��
	private Singleton() {
		
	}
	
	//3.�����ṩ��̬�Ĺ���������ʹ��ʱ�ٴ������󣩣�������ͬ��
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
