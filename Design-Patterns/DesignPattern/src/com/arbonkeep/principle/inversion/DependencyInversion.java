package com.arbonkeep.principle.inversion;
/**
 * ʵ��һ��������תԭ��ĳ���
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
  ��ʽ1�ķ���
  	1.��
  	2.���������Ҫ����΢�š�qq�����ݣ���ô��Ҫ�����µ��࣬ͬʱ����Ҫ��Person��������µķ�����ά���鷳
  	3.�������������һ������ӿ�Ireciever����ʾ�����ߣ�����Person�����ӿ�������ͬʱ����΢��qq����
  	 		���շ�Χ����ôֻ��Ҫ���Ǹ���ʵ�ֽӿھ��У���ͷ�����������תԭ��
  	 	
  	
 */

class Email {
	public String getInfo() {
		return "�����ʼ�:hello,world";
	}
}

class Person {
	public void recieve(Email e) {
		System.out.println(e.getInfo());
	}
}
