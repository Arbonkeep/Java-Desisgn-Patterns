package com.arbonkeep.template;

public class Client {
	public static void main(String[] args) {
		
		System.out.println("---------�����ڶ����� -----------------");
		SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
		blackBeanSoyaMilk.make();
		
		System.out.println("---------�����춹����------------------");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		
	}
}
