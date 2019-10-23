package com.arbonkeep.facade;
//爆米花类
public class Popcorn {
	private static Popcorn popcorn = new Popcorn();
	
	public static Popcorn getInstance() {
		return popcorn;
	}
	
	public void on() {
		System.out.println("打开制作机器");
	}
	public void off() {
		System.out.println("关闭制作机器");
	}
	public void pop() {
		System.out.println("制作爆米花");
	}
	
	
}
