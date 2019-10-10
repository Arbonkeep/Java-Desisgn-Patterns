package com.arbonkeep.principle.singleresponsibility;
/**
 * 演示单一职责原则
 * @author asus
 *
 */
public class SingleResponsibility1 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("火车");
		vehicle.run("飞机");
		vehicle.run("轮船");
	}

}
/*
 分析：
 	1.在方式 1中违反了职责单一原则
 	2.解决方案：将功能分解成不同的类===> 方式2
 */
class Vehicle {
	
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行");
	}
	

}
