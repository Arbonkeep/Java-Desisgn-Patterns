package com.arbonkeep.adapter.objectadapter;

public class VoltageAdapter implements Voltage5V {
	private Voltage220V voltage220v;
	
	//通过构造方法将值传入
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}

	@Override
	public int output5V() {
		int dest = 0;
		if(voltage220v != null) {
			//获取220v电压
			int src = voltage220v.output220V();
			System.out.println("对象适配器模式");
			dest = src / 44;
			System.out.println("输出电压为" + dest + "V");
		}
		
		return dest;
	}
}
