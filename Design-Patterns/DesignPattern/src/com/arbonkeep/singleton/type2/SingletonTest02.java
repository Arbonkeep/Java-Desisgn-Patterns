package com.arbonkeep.singleton.type2;


public class SingletonTest02 {

	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

//饿汉式(静态代码块)
class Singleton {
	//1.私有化构造方法
	private Singleton() {
		
	}
	
	//2.声明静态成员变量
	private static Singleton singleton;
	
	//3.在静态代码块中构建对象
	static {
		singleton = new Singleton();
	}
	
	//4.对外提供静态的获取对象的方法
	
	public static Singleton getInstance() {
		return singleton;
	}
}
