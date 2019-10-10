package com.arbonkeep.principle.liskov.improve;
/**
 * 实现里氏替换原则的程序
 * @author asus
 *
 */
public class Liskov {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("11 -3 = " + a.fun1(11,3));
		System.out.println("1 - 8 = " + a.fun1(1, 8));
		
		
		B b = new B();
		
		//由于B类不再继承A类，因此调用者，不会重写A中的方法
		System.out.println("11 + 3 = " + b.fun1(11, 3));
		System.out.println("1 + 8 = " + b.fun1(1, 8));
		System.out.println("11 - 3 = " + b.fun3(11, 3));

	}

}

class Base {
	//减法
	public int fun1(int a, int b) {
		return a - b;
	}
}

class A extends Base{
	public int fun1(int a, int b) {
		return a - b; 
	}
}

class B extends Base {
	//如果B需要用到A的方法我们使用组合的方式
	private A a = new A();
	
	public int fun1(int a, int b) {
		return a + b;
	}
	
	public int fun2(int a, int b) {
		return fun1(a, b) + 9;
	}
	
	public int fun3(int a, int b) {
		return this.a.fun1(a, b);
	}
}

