package com.arbonkeep.visitor;

public class Wait extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("男人为歌手的评分为wait");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人为歌手的评分为wait");
		
	}

}
