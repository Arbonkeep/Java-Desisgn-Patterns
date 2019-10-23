package com.arbonkeep.facade;
//投影仪类
public class Projector {
	private static Projector projector = new Projector();
	
	public static Projector getInstance() {
		return projector;
	}
	
	public void on() {
		System.out.println("打开投影仪");
	}
	public void off() {
		System.out.println("关闭投影仪");
	}
	public void zoom() {
		System.out.println("缩放投影仪");
	}
	public void focus() {
		System.out.println("投影仪调焦");
	}
}
