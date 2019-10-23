package com.arbonkeep.facade;
//剧场灯光
public class TheaterLights {
	private static TheaterLights instance = new TheaterLights();
	
	public static TheaterLights getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("打开灯光");
	}
	public void off() {
		System.out.println("关闭灯光");
	}
	public void dim() {
		System.out.println("调暗灯光");
	}
	public void bright() {
		System.out.println("调亮灯光");
	}
}
