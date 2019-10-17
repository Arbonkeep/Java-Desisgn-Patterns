package com.arbonkeep.Builder.improve;
//抽象类，描述出盖房的流程
public abstract class HouseBuilder {
	House house = new House();//因为是组合关系所以需要new
	
	public abstract void buildBasic();
	
	public abstract void buildWall();
	
	public abstract void roofed();
	
	//将房子返回
	public House build() {
		return house;
	}
}
