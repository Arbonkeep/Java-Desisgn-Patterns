package com.arbonkeep.principle.segregation.improve;


/**
 * 接口隔离原则的代码实现，对Segregation1的改进
 * @author asus
 * 
 * 		由于在同一个包下不能有两个接口名相同的接口在这个类中，我们使用Interface2代替Interface1
 * 		使用A1代表A，B1代表B，C1代表C，D1代表D，在这里我们需要拆分成3个接口
 *
 */
public class Segregation1 {
	public static void main(String[] args) {
		A a = new A();
		a.depend1(new B());//A类通过接口去依赖B类
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());//C类通过接口去依赖（使用）D类
		c.depend4(new D());
		c.depend5(new D());
		
	}
}

//定义一个接口Interface2,接口中有五个方法

interface Interface1 {
	void operation1();
}

interface Interface2 {
	void operation2();
	void operation3();
}
interface Interface3 {
	void operation4();
	void operation5();
}

class B implements Interface1,Interface2 {

	public void operation1() {	
		System.out.println("B 实现了 operation1");
	}
	public void operation2() {	
		System.out.println("B 实现了 operation2");
	}
	public void operation3() {	
		System.out.println("B 实现了 operation3");
	}
	
}

class D implements Interface1, Interface3 {
	
	public void operation1() {	
		System.out.println("D 实现了 operation1");
	}
	
	public void operation4() {	
		System.out.println("D 实现了 operation4");
	}
	
	public void operation5() {	
		System.out.println("D 实现了 operation5");
	}
}

class A {//A类通过接口Interface1 依赖（使用）B类，但是只会使用到1,2,3方法
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface2 i) {
		i.operation2();
	}
	public void depend3(Interface2 i) {
		i.operation3();
	}
}

class C {//C类通过接口Interface1 依赖（使用）D类，但是只会使用到1,2,3方法
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface3 i) {
		i.operation4();
	}
	public void depend5(Interface3 i) {
		i.operation5();
	}
}
