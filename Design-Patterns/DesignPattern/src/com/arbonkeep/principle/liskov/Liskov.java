package com.arbonkeep.principle.liskov;
/**
 * 实现里氏替换原则的程序对前面的程序进行改进
 * @author asus
 *
 */
public class Liskov {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("11 -3 = " + a.fun1(11,3));
		System.out.println("1 - 8 = " + a.fun1(1, 8));
		
		
		B b = new B();
		System.out.println("11 - 3 = " + b.fun1(11, 3));//由于重写了方法所以得到结果出错，不是本意的结果
		System.out.println("1 - 8 = " + b.fun1(1, 8));
		System.out.println("11 - 3 = " + b.fun2(11, 3));

	}

}
/*
 
  由于无意中重写了方法，所以结果出错，如何解决呢？里氏替换原则
  
 	解决方案：将原来的父类和子类都继承一个更加通俗的基类，原有的继承关系去掉，使用聚合、组合、依赖关系代替
 
 */



class A {
	public int fun1(int a, int b) {
		return a - b; 
	}
}

class B extends A {
	//这里无意识的重写了classA中的fun1方法
	public int fun1(int a, int b) {
		return a + b;
	}
	
	public int fun2(int a, int b) {
		return fun1(a, b) + 9;
	}
}

