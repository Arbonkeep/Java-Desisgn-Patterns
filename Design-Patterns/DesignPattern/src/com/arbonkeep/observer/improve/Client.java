package com.arbonkeep.observer.improve;

public class Client {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		//创建观察者
		CurrentConditions currentConditions = new CurrentConditions();
		
		//注册到weatherData
		weatherData.registerObserver(currentConditions);
		
		System.out.println("通知观察者CurrentConditions 查看信息");
		weatherData.setData(20, 100, 35);
		
		System.out.println("=====================");
		
		System.out.println("查看百度天气");
		weatherData.setData(30, 200, 15);
	}
}
