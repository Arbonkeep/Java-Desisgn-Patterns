package com.arbonkeep.decorator;

public abstract class Drink {
	public String desc;//声明描述属性
	
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
	
	//提供一个抽象的cost方法用于统计收费
	public abstract float cost();
	
	
}
