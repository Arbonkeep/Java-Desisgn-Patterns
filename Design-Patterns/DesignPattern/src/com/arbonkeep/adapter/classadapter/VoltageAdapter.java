package com.arbonkeep.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {

	@Override
	public int ouput5V() {
		//���÷�����ȡ��220v�ĵ�ѹ
		int srcV = output220V();
		
		//����ȡ����220Vת��Ϊ5V
		int destV = srcV / 44;
		
		//System.out.println("��ѹΪ" + destV + "V");
		
		return destV;
		
	}

}
