package com.arbonkeep.strategy.improve;

public class WildDuck extends Duck{
	//��������ָ��������Ϊ
	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GaGaQuackBehavior();
	}
	@Override
	public void display() {
		System.out.println("ҰѼ��");
		
	}

}
