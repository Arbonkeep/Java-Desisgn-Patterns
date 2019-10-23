package com.arbonkeep.facade;
//音响类
public class Stereo {
    private static Stereo instance = new Stereo();
	
	public static Stereo getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("打开音响");
	}
	public void off() {
		System.out.println("关闭音箱");
	}
	public void zoom() {
		System.out.println("调高音箱声音");
	}
	
}
