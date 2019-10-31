package com.arbonkeep.strategy;

public class ToyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("这是玩具鸭");
		
	}
	
	public void quack() {
		System.out.println("玩具鸭不会叫");
	}
	
	public void swim() {
		System.out.println("玩具鸭不会游泳");
	}
	
	public void fly() {
		System.out.println("玩具鸭不会飞");
	}

}
