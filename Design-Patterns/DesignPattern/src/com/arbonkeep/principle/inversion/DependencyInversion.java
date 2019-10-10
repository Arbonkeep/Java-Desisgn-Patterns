package com.arbonkeep.principle.inversion;
/**
 * 实现一个依赖倒转原则的程序
 * @author asus
 *
 */
public class DependencyInversion {

	public static void main(String[] args) {
		Person p = new Person();
		p.recieve(new Email());

	}

}
/*
  方式1的分析
  	1.简单
  	2.如果我们需要接收微信、qq的内容，那么需要增加新的类，同时还需要在Person类中添加新的方法，维护麻烦
  	3.解决方案：引入一个抽象接口Ireciever，表示接收者，这样Person类就与接口依赖，同时由于微信qq属于
  	 		接收范围，那么只需要它们各自实现接口就行，这就符合了依赖倒转原则
  	 	
  	
 */

class Email {
	public String getInfo() {
		return "电子邮件:hello,world";
	}
}

class Person {
	public void recieve(Email e) {
		System.out.println(e.getInfo());
	}
}
