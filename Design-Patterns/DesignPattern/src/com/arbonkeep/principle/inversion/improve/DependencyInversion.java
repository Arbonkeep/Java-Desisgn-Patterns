package com.arbonkeep.principle.inversion.improve;
/**
 * 实现一个依赖倒转原则的程序
 * @author asus
 *
 */
public class DependencyInversion {

	public static void main(String[] args) {
		Person p = new Person();
		p.recieve(new Email());
		p.recieve(new WeiXin());

	}

}
//方式2：通过多态改进，也就是使用接口，符合依赖倒转原则

interface Ireciever {
	public String getInfo();
}

//电子邮件
class Email implements Ireciever {
	public String getInfo() {
		return "电子邮件:hello,world";
	}
}

//微信
class WeiXin implements Ireciever {
	public String getInfo() {
		return "微信消息：你好呀";
	}
}

class Person {
	//对接口的依赖
	public void recieve(Ireciever i) {
		System.out.println(i.getInfo());
	}
}
