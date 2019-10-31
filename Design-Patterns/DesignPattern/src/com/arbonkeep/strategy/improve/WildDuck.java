package com.arbonkeep.strategy.improve;

public class WildDuck extends Duck{
	//构造器，指定具体行为
	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GaGaQuackBehavior();
	}
	@Override
	public void display() {
		System.out.println("野鸭子");
		
	}

}
