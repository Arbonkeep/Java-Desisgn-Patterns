package com.arbonkeep.bridge;

public class FoldedPhone extends Phone{

	//���췽��
	public FoldedPhone(Brand brand) {
		super(brand);
		
	}
	
	@Override
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("�۵���ʽ���ֻ�");
	}
	
	@Override
	protected void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("�۵���ʽ���ֻ�");
	}
	
	@Override
	protected void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("�۵���ʽ���ֻ�");
	}

}
