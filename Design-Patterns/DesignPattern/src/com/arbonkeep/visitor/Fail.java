package com.arbonkeep.visitor;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("����Ϊ���ֵ�����Ϊʧ��");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Ů��Ϊ���ֵ�����Ϊʧ��");
		
	}

}
