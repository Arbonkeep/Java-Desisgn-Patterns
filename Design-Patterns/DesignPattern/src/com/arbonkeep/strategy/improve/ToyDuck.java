package com.arbonkeep.strategy.improve;

public class ToyDuck extends Duck {
	
	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
		quackBehavior = new NoQuackBehavior();
		
	}

	@Override
	public void display() {
		System.out.println("Íæ¾ßÑ¼");
		
	}

}
