package com.arbonkeep.state;

public abstract class State {
	//抽象扣钱
	public abstract void deductMoney();
	//是否中奖
	public abstract boolean raffle();
	//发放奖品
	public abstract void dispensePrize();
	
}
