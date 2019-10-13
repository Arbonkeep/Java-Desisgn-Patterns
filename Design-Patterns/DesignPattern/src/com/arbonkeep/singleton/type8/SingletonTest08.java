package com.arbonkeep.singleton.type8;

public class SingletonTest08 {

	public static void main(String[] args) {
		//����
		Singleton singleton = Singleton.singleton;
		Singleton singleton2 = Singleton.singleton;
		
		System.out.println(singleton == singleton2);//true,˵����ȡ����ͬһ������
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

//ͨ��ö��ʵ�ֵ���ģʽ
enum Singleton {
	singleton;
	public void say() {
		System.out.println("hello");
	}
}
