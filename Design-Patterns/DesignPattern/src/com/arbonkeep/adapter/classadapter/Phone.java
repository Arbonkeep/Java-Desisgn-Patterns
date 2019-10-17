package com.arbonkeep.adapter.classadapter;

public class Phone {
	
	public void Charging(Voltage5V voltage5v) {
		
		if(voltage5v.ouput5V() == 5) {
			System.out.println("电压为5V，可以充电");
		}else {
			System.out.println("电压不匹配，充电失败");
		}
	} 
}
