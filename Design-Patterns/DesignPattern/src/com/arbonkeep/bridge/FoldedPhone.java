package com.arbonkeep.bridge;

public class FoldedPhone extends Phone{

	//构造方法
	public FoldedPhone(Brand brand) {
		super(brand);
		
	}
	
	@Override
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("折叠样式的手机");
	}
	
	@Override
	protected void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("折叠样式的手机");
	}
	
	@Override
	protected void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("折叠样式的手机");
	}

}
