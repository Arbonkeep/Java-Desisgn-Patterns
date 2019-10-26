package com.arbonkeep.observer;
/**
 核心类
 	1.包含天气情况信息
 	2.含有CurrentConditions对象
 	3.当数据更新时，就主动调用CurrentConditions的update方法（包含display），这样接入方就能看到最新信息
 */
public class WeatherData {
	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	
	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
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
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}
	
	public void setData(float temperature, float pressure, float humidity) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		dataChange();
	}
	
	
	
}
