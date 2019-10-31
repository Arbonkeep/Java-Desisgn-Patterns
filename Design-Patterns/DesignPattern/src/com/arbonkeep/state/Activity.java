package com.arbonkeep.state;

public class Activity {
	//表示当前活动状态
	State state = null;
	//表示奖品数量
	int count = 0;
	
	//四个属性表示四种状态
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);
	State depenseState = new DespenseState(this);
	State depenseOutState = new DespenseOutState(this);
	
	//构造器
	//初始化当前状态为不能抽奖，并初始化奖品数量
	public Activity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}
	
	//扣分,调用当前状态的debuctMoney
	public void debuctMoney() {
		state.deductMoney();
	}
	
	//抽奖
	public void raffle() {
		//如果当前状态是抽奖成功
		if(state.raffle()) {
			//领取奖品
			state.dispensePrize();
		}
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	//每领取一次奖品count--
	public int getCount() {
		int curCount = count;//记录当前奖品数量
		count--;
		return curCount;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public State getNoRaffleState() {
		return noRaffleState;
	}

	public State getCanRaffleState() {
		return canRaffleState;
	}

	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}

	public State getDepenseState() {
		return depenseState;
	}

	public void setDepenseState(State depenseState) {
		this.depenseState = depenseState;
	}

	public State getDepenseOutState() {
		return depenseOutState;
	}

	public void setDepenseOutState(State depenseOutState) {
		this.depenseOutState = depenseOutState;
	}

	public void setNoRaffleState(State noRaffleState) {
		this.noRaffleState = noRaffleState;
	}
	
	
	
	
	
}
