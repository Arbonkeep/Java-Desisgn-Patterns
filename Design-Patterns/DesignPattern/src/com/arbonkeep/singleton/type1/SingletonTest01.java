package com.arbonkeep.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}

}

//饿汉式（静态变量）

class Singleton {
	//1.构造器私有化
	private Singleton() {
		
	}
	
	//2.本类内部创建对象实例
	private final static Singleton singleton = new Singleton();
	
	//3.对外提供静态的公共的获取对象的方法
	public static Singleton getInstance() {
		return singleton;
	}
}
