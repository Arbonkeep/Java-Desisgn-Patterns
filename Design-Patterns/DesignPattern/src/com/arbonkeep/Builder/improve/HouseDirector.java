package com.arbonkeep.Builder.improve;
//指挥者类,指定制作流程返回产品
public class HouseDirector {
	HouseBuilder houseBuilder = null;//因为是聚合关系所以为null
	
	//构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//通过set方法传入HouseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//如何创建房子
	public House createHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWall();
		houseBuilder.roofed();
		
		return houseBuilder.build();
	}
	
	
	
}
