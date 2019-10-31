package com.arbonkeep.strategy.improve;

public abstract class Duck {
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;
	
	//���췽��
	public Duck() {
		
	}
	
	
	public abstract void display();
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
