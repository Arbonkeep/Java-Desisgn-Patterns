package com.arbonkeep.visitor;

public class Success extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("����Ϊ���ֵ�����Ϊ�ɹ�");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Ů��Ϊ���ֵ�����Ϊ�ɹ�");
		
	}

}
