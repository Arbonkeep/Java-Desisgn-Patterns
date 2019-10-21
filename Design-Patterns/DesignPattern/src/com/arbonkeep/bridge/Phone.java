package com.arbonkeep.bridge;

public class Phone {
	private Brand brand;
	
	//���췽��(ͨ������������Brand�еķ���)
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	} 
	
	protected void close() {
		this.brand.close();
	}
	
	protected void open() {
		this.brand.open();
	}
	
	protected void call() {
		this.brand.call();
	}
}
