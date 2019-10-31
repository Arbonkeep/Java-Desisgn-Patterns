package com.arbonkeep.state;

public class Client {
	public static void main(String[] args) {
		//创建活动对象，指定奖品为1
		Activity activity = new Activity(1);
		
		//抽奖30次
		for (int i = 0; i < 30; i++) {
			System.out.println("-------------第" + (i + 1) + "次抽奖-------------");
			activity.debuctMoney();//扣积分
			activity.raffle();//抽奖
		}
	}
}
