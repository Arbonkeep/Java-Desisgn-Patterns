package com.arbonkeep.chainofresponsibility;

public class PurchaseRequest {
	private int type = 0;
	private float price = 0.0f;
	private int id = 0;
	
	//���췽��
	public PurchaseRequest(int type, float d, int id) {
		this.id = id;
		this.price = d;
		this.type = type;
	}

	//�ṩ��Ӧ��get����
	public int getType() {
		return type;
	}

	public float getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}
	
	
}
