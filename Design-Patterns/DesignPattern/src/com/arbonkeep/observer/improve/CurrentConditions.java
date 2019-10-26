package com.arbonkeep.observer.improve;

public class CurrentConditions implements Observer{
	private float temperature;
	private float pressure;
	private float humidity;
	
	//更新天气情况
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		display();
	}
	
	//显示
	public void display() {
		System.out.println("今天气温是" + temperature + "度");
		System.out.println("今天气压是" + pressure + "帕");
		System.out.println("今天湿度是" + humidity + "度");
	}

}
