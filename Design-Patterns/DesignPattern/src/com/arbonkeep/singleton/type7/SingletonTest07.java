package com.arbonkeep.singleton.type7;


public class SingletonTest07 {
	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}

}

//��̬�ڲ���ʵ������ʽ
//���ַ�ʽ�����˾�̬�ڲ������������
//	<1> �ⲿ��ļ��ز��ᵼ�¾�̬�ڲ���ļ��أ���֤��������
//	<2> �ڼ��ؾ�̬�ڲ����ʱ���ȥʵ����Singleton����ʵ�����ڼ��������ʱ���߳��ǰ�ȫ�ģ�����߳��޷����룬��֤���̰߳�ȫ

class Singleton {
	//1.˽�л����췽��
	private Singleton() {
		
	}
	
	//2.����һ����̬�ڲ���(�����ڸ�������һ����̬����Singleton)
	static class SingletonInstance {
		private static final Singleton SINGLETON = new Singleton();
	}
	
	//3.�ṩһ����̬�Ĺ���������ֱ�ӷ���SingletonInstance.SINGLETON
	public static Singleton getInstance() {
		return SingletonInstance.SINGLETON;
	}
}
