package com.arbonkeep.visitor;

public class Wait extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("����Ϊ���ֵ�����Ϊwait");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Ů��Ϊ���ֵ�����Ϊwait");
		
	}

}
