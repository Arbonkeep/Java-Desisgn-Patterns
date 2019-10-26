package com.arbonkeep.observer;

public class Client {
	public static void main(String[] args) {
		//创建接入方，currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//创建WeatherData，将接入方传入
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//更新天气
		weatherData.setData(30, 150, 40);
		
	}
}
