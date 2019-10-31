package com.arbonkeep.state;
//奖品发送完毕状态说明，当我们activity改变成DespenseOutState，抽奖活动结束
public class DespenseOutState extends State {
	Activity activity;
	
	//构造器
	public DespenseOutState(Activity activity) {
		this.activity = activity;
	}
	
	@Override
	public void deductMoney() {
		System.out.println("奖品发完了，请下次参加");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品发完了，请下次参加");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品发完了，请下次参加");
		
	}

}
