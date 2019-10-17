package com.arbonkeep.Builder;

public class CommonHouse extends AbstractHouse{

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("普通房子建地基");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("普通房子建墙");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("普通房子封顶");
	}

}
