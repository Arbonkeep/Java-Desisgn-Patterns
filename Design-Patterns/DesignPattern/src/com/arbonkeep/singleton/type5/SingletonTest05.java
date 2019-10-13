package com.arbonkeep.singleton.type5;

public class SingletonTest05 {

	public static void main(String[] args) {
		

	}

}

//懒汉式(线程安全，同步代码块),这种方式不能实现线程的安全问题

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
