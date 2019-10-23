package com.arbonkeep.facade;
//DVD类
public class DVDPlayer {
	//使用饿汉式单例模式
	private static DVDPlayer instance = new DVDPlayer();
	
	public static DVDPlayer getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("打开DVD");
	}
	
	public void off() {
		System.out.println("关闭DVD");
	}
	
	public void play() {
		System.out.println("正在播放电影");
	}
	
	public void pause() {
		System.out.println("停止播放");
	}
	
	public void end() {
		System.out.println("结束播放");
	}
}

