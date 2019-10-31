package com.arbonkeep.strategy.improve;

public class Client {
	public static void main(String[] args) {
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();
		
		wildDuck.setFlyBehavior(new NoFlyBehavior());//设置野鸭子不会飞行
		wildDuck.fly();
	}
}
