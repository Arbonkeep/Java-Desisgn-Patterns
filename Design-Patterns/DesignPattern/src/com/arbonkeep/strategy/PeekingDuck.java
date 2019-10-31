package com.arbonkeep.strategy;
//北京鸭子
public class PeekingDuck extends Duck {

	@Override
	public void display() {
		System.out.println("这是北京鸭子");
		
	}

	@Override
	public void fly() {
		System.out.println("北京鸭子不会飞");
	}
}
