package com.arbonkeep.singleton.type4;

public class SingletonTest04 {

	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());		

	}

}
//懒汉式(线程安全，同步方法)
class Singleton {
	//1.声明成员变量
	private static Singleton singleton;
	
	//2.私有化构造方法
	private Singleton() {
		
	}
	
	//3.对外提供静态的公共方法（使用时再创建对象），并进行同步
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
