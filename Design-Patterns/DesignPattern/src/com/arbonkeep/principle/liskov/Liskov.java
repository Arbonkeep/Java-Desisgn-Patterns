package com.arbonkeep.principle.liskov;
/**
 * ʵ�������滻ԭ��ĳ����ǰ��ĳ�����иĽ�
 * @author asus
 *
 */
public class Liskov {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("11 -3 = " + a.fun1(11,3));
		System.out.println("1 - 8 = " + a.fun1(1, 8));
		
		
		B b = new B();
		System.out.println("11 - 3 = " + b.fun1(11, 3));//������д�˷������Եõ�����������Ǳ���Ľ��
		System.out.println("1 - 8 = " + b.fun1(1, 8));
		System.out.println("11 - 3 = " + b.fun2(11, 3));

	}

}
/*
 
  ������������д�˷��������Խ��������ν���أ������滻ԭ��
  
 	�����������ԭ���ĸ�������඼�̳�һ������ͨ�׵Ļ��࣬ԭ�еļ̳й�ϵȥ����ʹ�þۺϡ���ϡ�������ϵ����
 
 */



class A {
	public int fun1(int a, int b) {
		return a - b; 
	}
}

class B extends A {
	//��������ʶ����д��classA�е�fun1����
	public int fun1(int a, int b) {
		return a + b;
	}
	
	public int fun2(int a, int b) {
		return fun1(a, b) + 9;
	}
}

