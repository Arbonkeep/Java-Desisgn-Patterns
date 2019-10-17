package com.arbonkeep.Builder.improve;
//高楼
public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("高楼的地基为10米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("高楼的墙为20厘米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("高楼的房顶为圆顶");
	}

}
