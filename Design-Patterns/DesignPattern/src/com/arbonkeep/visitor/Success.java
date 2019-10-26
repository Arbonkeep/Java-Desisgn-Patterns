package com.arbonkeep.visitor;

public class Success extends Action{

	@Override
	public void getManResult(Man man) {
		System.out.println("男人为歌手的评分为成功");
		
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人为歌手的评分为成功");
		
	}

}
