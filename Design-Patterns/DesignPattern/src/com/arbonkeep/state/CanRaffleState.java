package com.arbonkeep.state;

import java.util.Random;

//能够抽奖状态
public class CanRaffleState extends State {
	Activity activity;
	
	//构造器
	public CanRaffleState(Activity activity) {
		this.activity = activity;
	}
	
	//当前状态已经扣过了积分	
	@Override
	public void deductMoney() {
		System.out.println("之前已经扣过积分了");
		
	}

	//当前状态需要进行抽奖活动（如果抽奖成功就将状态设置为发放奖品或者不能抽奖的状态）
	@Override
	public boolean raffle() {
		System.out.println("开始抽奖，请稍等");
		Random random = new Random();//随机生成0到9的数
		int num = random.nextInt(10);
		if(num == 3) {
			//抽奖成功将状态设置为发放奖品
			activity.setState(activity.getDepenseState());
			return true;
		}else {
			System.out.println("很遗憾没有抽中奖品");
			//抽奖失败将状态设置为不能抽奖
			activity.setState(activity.getNoRaffleState());
			return false;
		}
		
	}
	//当前状态不能发放奖品
	@Override
	public void dispensePrize() {
		System.out.println("没中奖，不能够发放奖品");
		
	}

}
