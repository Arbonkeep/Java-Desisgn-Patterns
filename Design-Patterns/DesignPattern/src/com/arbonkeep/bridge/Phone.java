package com.arbonkeep.bridge;

public class Phone {
	private Brand brand;
	
	//构造方法(通过构造器调用Brand中的方法)
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
