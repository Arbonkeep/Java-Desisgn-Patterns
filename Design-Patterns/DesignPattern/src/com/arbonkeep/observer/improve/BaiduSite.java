package com.arbonkeep.observer.improve;

public class BaiduSite implements Observer{
	private float temperature;
	private float pressure;
	private float humidity;
	
	//�����������
	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		display();
	}
	
	//��ʾ
	public void display() {
		System.out.println("����ٶ�������" + temperature + "��");
		System.out.println("����ٶ���ѹ��" + pressure + "��");
		System.out.println("����ٶ�ʪ����" + humidity + "��");
	}
}
