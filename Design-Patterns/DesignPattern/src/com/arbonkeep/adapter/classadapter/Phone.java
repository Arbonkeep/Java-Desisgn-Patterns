package com.arbonkeep.adapter.classadapter;

public class Phone {
	
	public void Charging(Voltage5V voltage5v) {
		
		if(voltage5v.ouput5V() == 5) {
			System.out.println("��ѹΪ5V�����Գ��");
		}else {
			System.out.println("��ѹ��ƥ�䣬���ʧ��");
		}
	} 
}
