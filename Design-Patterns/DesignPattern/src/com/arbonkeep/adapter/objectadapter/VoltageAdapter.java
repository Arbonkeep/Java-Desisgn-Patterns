package com.arbonkeep.adapter.objectadapter;

public class VoltageAdapter implements Voltage5V {
	private Voltage220V voltage220v;
	
	//ͨ�����췽����ֵ����
	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}

	@Override
	public int output5V() {
		int dest = 0;
		if(voltage220v != null) {
			//��ȡ220v��ѹ
			int src = voltage220v.output220V();
			System.out.println("����������ģʽ");
			dest = src / 44;
			System.out.println("�����ѹΪ" + dest + "V");
		}
		
		return dest;
	}
}
