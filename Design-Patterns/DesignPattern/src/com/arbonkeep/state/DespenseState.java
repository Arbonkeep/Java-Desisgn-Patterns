package com.arbonkeep.state;

public class DespenseState extends State {
	Activity activity;
	
	//初始化时，传入活动索引，发放奖品后改变状态
	public DespenseState(Activity activity) {
		this.activity = activity;
	}
		
	@Override
	public void deductMoney() {
		System.out.println("不能扣除积分");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("不能抽奖");
		return false;
	}

	//发放奖品
	@Override
	public void dispensePrize() {
		if(activity.getCount() > 0) {
			System.out.println("恭喜中奖了");
			//改变状态为不能抽奖
			activity.setState(activity.getNoRaffleState());
		}else {
			//改变状态为奖品发送完毕，后面就不能继续抽奖
			System.out.println("很遗憾，奖品发完了");
			activity.setState(activity.getDepenseOutState());
		}
		
	}

}
