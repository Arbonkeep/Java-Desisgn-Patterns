package com.arbonkeep.Builder.improve;
//普通房子类
public class CommonHouse extends HouseBuilder{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("普通房子地基为5米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("普通房子墙为10厘米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("普通房子房顶为平顶");
		
	}

}
