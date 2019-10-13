package com.arbonkeep.singleton.type6;

public class SingletonTest06 {
	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());	
	}
}

//双重检查
class Singleton {
	//1.声明成员变量,使用volatile修饰
	private static volatile Singleton singleton;
	
	//2.私有化构造方法
	private Singleton() {
		
	}
	
	//3.提供一个静态的公有方法，加入双重检查低吗，解决线程安全问题，同时解决懒加载问题
	//同时保证了效率
	
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
