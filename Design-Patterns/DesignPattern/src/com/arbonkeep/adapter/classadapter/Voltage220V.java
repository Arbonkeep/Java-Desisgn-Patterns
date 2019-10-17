package com.arbonkeep.adapter.classadapter;
//被适配类
public class Voltage220V {
	//输出220V电压的方法
	public int output220V() {
		int src = 220;
		
		System.out.println("电压为" + src + "V");
		return src;
	}
}
