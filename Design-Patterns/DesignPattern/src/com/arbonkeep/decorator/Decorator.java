package com.arbonkeep.decorator;

public class Decorator extends Drink {
	private Drink obj;
	
	//���췽��(ͨ�������������󴫽���)
	public Decorator(Drink obj) {//���
		this.obj = obj; 
	}
	
	@Override
	public float cost() {
		//��ȡ������ļ۸��Լ�����ļ۸�
		return super.getPrice() + obj.cost();
	}
	
	public String getDesc() {
		return super.desc + " " + super.getPrice() + " && " + obj.getDesc();
		//obj.getDesc()�����װ���ߵ���Ϣ
	}

}
	