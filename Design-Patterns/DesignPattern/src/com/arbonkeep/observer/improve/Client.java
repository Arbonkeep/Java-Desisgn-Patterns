package com.arbonkeep.observer.improve;

public class Client {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		//�����۲���
		CurrentConditions currentConditions = new CurrentConditions();
		
		//ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		
		System.out.println("֪ͨ�۲���CurrentConditions �鿴��Ϣ");
		weatherData.setData(20, 100, 35);
		
		System.out.println("=====================");
		
		System.out.println("�鿴�ٶ�����");
		weatherData.setData(30, 200, 15);
	}
}
