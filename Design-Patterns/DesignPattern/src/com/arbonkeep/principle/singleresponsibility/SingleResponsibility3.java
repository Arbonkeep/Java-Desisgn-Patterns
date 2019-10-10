package com.arbonkeep.principle.singleresponsibility;
//方式3
public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2();
		v.roadRun("汽车");
		v.waterRun("轮船");
		v.airRun("飞机");
	}
}
/*
 分析：
 	1. 这种方式没有对原来的类进行修改，只是增加了犯法
 	2. 这个方式虽然没有在类的级别上遵循职责单一原则，但是在方法级别上，也是遵循了职责单一原则
  */

class Vehicle2 {
	public void waterRun(String str) {
		System.out.println(str + "在水上运行");
	}
	
	public void roadRun(String str) {
		System.out.println(str + "在公路上运行");
	}
	
	public void airRun(String str) {
		System.out.println(str + "在天空中运行");
	}
}
