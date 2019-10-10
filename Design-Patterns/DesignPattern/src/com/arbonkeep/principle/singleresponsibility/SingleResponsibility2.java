package com.arbonkeep.principle.singleresponsibility;
//方式2
public class SingleResponsibility2 {
	public static void main(String[] args) {
		WaterVehicle wv = new WaterVehicle();
		wv.run("轮船");
		
		RoadVehicle rv = new RoadVehicle();
		rv.run("汽车");
		
		AirVehicle av = new AirVehicle();
		av.run("飞机");
		
	}
	
}
/*
 分析：
 	1. 方式2遵循了职责单一的原则，但是代码复杂增加了客户的代码量
 	2. 改进，直接修改Vehicle类，声明三个方法 ===> 方式3
 
 */


class WaterVehicle {
	public void run(String str) {
		System.out.println(str + "在水中运行");
	}
}

class RoadVehicle {
	public void run(String str) {
		System.out.println(str + "在公路上运行");
	}
}

class AirVehicle {
	public void run(String str) {
		System.out.println(str + "在水中运行");
	}
}
