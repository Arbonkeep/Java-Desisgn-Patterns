package com.arbonkeep.singleton.type8;

public class SingletonTest08 {

	public static void main(String[] args) {
		//测试
		Singleton singleton = Singleton.singleton;
		Singleton singleton2 = Singleton.singleton;
		
		System.out.println(singleton == singleton2);//true,说明获取的是同一个对象
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());

	}

}

//通过枚举实现单例模式
enum Singleton {
	singleton;
	public void say() {
		System.out.println("hello");
	}
}
