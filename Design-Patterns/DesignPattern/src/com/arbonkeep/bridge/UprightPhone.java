package com.arbonkeep.bridge;

public class UprightPhone extends Phone{

	//������
	public UprightPhone(Brand brand) {
		super(brand);
		
	}
	
	@Override
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("ֱ����ʽ���ֻ�");
	}
	
	@Override
	protected void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("ֱ����ʽ���ֻ�");
	}
	
	@Override
	protected void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("ֱ����ʽ���ֻ�");
	}

}
