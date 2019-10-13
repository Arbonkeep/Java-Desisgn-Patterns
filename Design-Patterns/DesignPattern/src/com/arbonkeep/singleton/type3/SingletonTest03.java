package com.arbonkeep.singleton.type3;



public class SingletonTest03 {
	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}
}

class Singleton {
	//1.声明成员变量
	private static Singleton singleton;
	
	//2.私有化构造方法
	private Singleton() {
		
	}
	
	//3.提供一个静态的公共方法当使用到实例的时候再创建它，也就是懒汉式
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
}