package com.arbonkeep.observer.improve;

import java.util.ArrayList;

/**
 * 核心类
	1.包含天气情况信息
 	2.含有CurrentConditions对象
 	3.当数据有更新时，使用ArrayList管理，通知所有接入方获取到所有最新信息
 * @author asus
 *
 */
public class WeatherData implements Subject{
	private float temperature;
	private float pressure;
	private float humidity;
	
	//观察者集合
	private ArrayList<Observer> observers;
	
	//构造器，初始化集合
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
	
	public void dataChange() {
		notifyObserver();
	}
	
	public void setData(float temperature, float pressure, float humidity) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		//调用dataChange，将新信息推送给接入方
		dataChange();
	}
	
	

	//注册观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	//删除观察者
	@Override
	public void remove(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
		
	}

	//遍历所有观察者，并通知
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this.temperature, this.pressure, this.humidity);
		}
		
	}

}
