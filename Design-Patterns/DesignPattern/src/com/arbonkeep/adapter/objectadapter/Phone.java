package com.arbonkeep.adapter.objectadapter;

public class Phone {

	public void charging(Voltage5V voltage5v) {
		if(voltage5v.output5V() == 5) {
			System.out.println("��ѹΪ5V�����Գ��");
		}else {
			System.out.println("��ѹ��ƥ�䣬���ܳ��");
		}
	}
}
