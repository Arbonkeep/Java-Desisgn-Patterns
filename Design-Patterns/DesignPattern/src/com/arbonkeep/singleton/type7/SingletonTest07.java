package com.arbonkeep.singleton.type7;


public class SingletonTest07 {
	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}

}

//静态内部类实现懒汉式
//这种方式利用了静态内部类的两个特性
//	<1> 外部类的加载不会导致静态内部类的加载，保证了懒加载
//	<2> 在加载静态内部类的时候才去实例化Singleton对象实例，在加载这个类时，线程是安全的，别的线程无法进入，保证了线程安全

class Singleton {
	//1.私有化构造方法
	private Singleton() {
		
	}
	
	//2.声明一个静态内部类(并且在该类中有一个静态属性Singleton)
	static class SingletonInstance {
		private static final Singleton SINGLETON = new Singleton();
	}
	
	//3.提供一个静态的公共方法，直接返回SingletonInstance.SINGLETON
	public static Singleton getInstance() {
		return SingletonInstance.SINGLETON;
	}
}
