package com.arbonkeep.visitor;

public class Client {
	public static void main(String[] args) {
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		//创建一个男人和开一个女人
		objectStructure.attach(new Man());//将男人添加到ObjectStructure
		objectStructure.attach(new Woman());
		
		//成功的评价
		Success success = new Success();
		objectStructure.display(success);//展示成功的评价(有两个人所以两个成功的评价)
		
		System.out.println("-------------------------------");
		
		//失败的评价
		Fail fail = new Fail();
		objectStructure.display(fail);//展示失败的评价
		
		System.out.println("----------------------------");
		//wait的评价
		Wait wait = new Wait();
		objectStructure.display(wait);
	}
}
