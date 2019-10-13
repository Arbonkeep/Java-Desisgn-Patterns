package com.arbonkeep.singleton.type5;

public class SingletonTest05 {

	public static void main(String[] args) {
		

	}

}

//����ʽ(�̰߳�ȫ��ͬ�������),���ַ�ʽ����ʵ���̵߳İ�ȫ����

class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				singleton = new Singleton();
			}
		}
		return singleton;
		
	}
}
