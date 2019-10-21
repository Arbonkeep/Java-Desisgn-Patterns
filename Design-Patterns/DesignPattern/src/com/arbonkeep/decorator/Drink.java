package com.arbonkeep.decorator;

public abstract class Drink {
	public String desc;//������������
	
	private float price = 0.0f;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	//�ṩһ�������cost��������ͳ���շ�
	public abstract float cost();
	
	
}
