package com.arbonkeep.state;

public class NoRaffleState extends State {
	Activity activity;
	
	//构造器
	public NoRaffleState(Activity activity) {
		this.activity = activity;
	}
	
	//当前状态可以扣除50积分，然后将状态设置为可以抽奖的状态
	@Override
	public void deductMoney() {
		System.out.println("扣除50积分成功，可以参与抽奖活动");
		//需要将状态设置为可以抽奖的状态
		activity.setState(activity.getCanRaffleState());
	}

	//当前状态不能抽奖
	@Override
	public boolean raffle() {
		System.out.println("此时还不能参与抽奖活动");
		return false;
	}

	//当前状态不能发放奖品
	@Override
	public void dispensePrize() {
		System.out.println("此时，不能够发放奖品");
		
	}

}
