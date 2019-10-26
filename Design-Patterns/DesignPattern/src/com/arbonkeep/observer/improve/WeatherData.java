package com.arbonkeep.observer.improve;

import java.util.ArrayList;

/**
 * ������
	1.�������������Ϣ
 	2.����CurrentConditions����
 	3.�������и���ʱ��ʹ��ArrayList����֪ͨ���н��뷽��ȡ������������Ϣ
 * @author asus
 *
 */
public class WeatherData implements Subject{
	private float temperature;
	private float pressure;
	private float humidity;
	
	//�۲��߼���
	private ArrayList<Observer> observers;
	
	//����������ʼ������
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
		//����dataChange��������Ϣ���͸����뷽
		dataChange();
	}
	
	

	//ע��۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	//ɾ���۲���
	@Override
	public void remove(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
		
	}

	//�������й۲��ߣ���֪ͨ
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(this.temperature, this.pressure, this.humidity);
		}
		
	}

}
