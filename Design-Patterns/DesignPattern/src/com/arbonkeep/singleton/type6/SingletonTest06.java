package com.arbonkeep.singleton.type6;

public class SingletonTest06 {
	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());	
	}
}

//˫�ؼ��
class Singleton {
	//1.������Ա����,ʹ��volatile����
	private static volatile Singleton singleton;
	
	//2.˽�л����췽��
	private Singleton() {
		
	}
	
	//3.�ṩһ����̬�Ĺ��з���������˫�ؼ����𣬽���̰߳�ȫ���⣬ͬʱ�������������
	//ͬʱ��֤��Ч��
	
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		
		return singleton;
	}
}
