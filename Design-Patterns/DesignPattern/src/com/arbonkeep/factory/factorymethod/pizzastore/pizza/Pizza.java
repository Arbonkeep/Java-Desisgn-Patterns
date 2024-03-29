package com.arbonkeep.factory.factorymethod.pizzastore.pizza;

public abstract class Pizza {
	protected  String name;
	
	//准备原材料，不同的pizza原料不一样，所以定义成一个抽象方法
	public abstract void prepare();
	
	public void bake() {
		System.out.println(name + " baking");
	}
	
	public void cut() {
		System.out.println(name + " cutting");
	}
	
	public void box() {
		System.out.println(name + " boxing");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
