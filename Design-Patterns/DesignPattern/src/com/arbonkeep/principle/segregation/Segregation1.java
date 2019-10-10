package com.arbonkeep.principle.segregation;
/**
 * 接口隔离原则的代码实现
 * @author asus
 * 
 * 	分析：
 * 		1. 在这个日子中，我们发现其实A类只使用B类中的1,2,3方法，也就是说4,5方法白写，同样C与D也与之类似
 * 		2. 解决：将接口Interface1拆分成几个独立的接口，类A与类C分别与他们所需要的接口建立依赖关系，也就是
 * 			         采用接口隔离原则，在这里，我们拆分成3个接口
 *
 */
public class Segregation1 {

}

//定义一个接口Interface1,接口中有五个方法

interface Interface1 {
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

class B implements Interface1 {

	public void operation1() {	
		System.out.println("B 实现了 operation1");
	}
	public void operation2() {	
		System.out.println("B 实现了 operation2");
	}
	public void operation3() {	
		System.out.println("B 实现了 operation3");
	}
	public void operation4() {	
		System.out.println("B 实现了 operation4");
	}
	public void operation5() {	
		System.out.println("B 实现了 operation5");
	}
}

class D implements Interface1 {
	
	public void operation1() {	
		System.out.println("D 实现了 operation1");
	}
	public void operation2() {	
		System.out.println("D 实现了 operation2");
	}
	public void operation3() {	
		System.out.println("D 实现了 operation3");
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
	public void depend2(Interface1 i) {
		i.operation2();
	}
	public void depend3(Interface1 i) {
		i.operation3();
	}
}

class C {//C类通过接口Interface1 依赖（使用）D类，但是只会使用到1,2,3方法
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface1 i) {
		i.operation4();
	}
	public void depend5(Interface1 i) {
		i.operation5();
	}
}
