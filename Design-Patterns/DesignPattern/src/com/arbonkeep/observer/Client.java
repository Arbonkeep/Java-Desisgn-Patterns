package com.arbonkeep.observer;

public class Client {
	public static void main(String[] args) {
		//�������뷽��currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//����WeatherData�������뷽����
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//��������
		weatherData.setData(30, 150, 40);
		
	}
}
