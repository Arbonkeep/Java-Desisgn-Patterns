package com.arbonkeep.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int ouput5V() {
		//调用方法获取到220v的电压
		int srcV = output220V();
		
		//将获取到的220V转换为5V
		int destV = srcV / 44;
		
		//System.out.println("电压为" + destV + "V");
		
		return destV;
		
	}

}
