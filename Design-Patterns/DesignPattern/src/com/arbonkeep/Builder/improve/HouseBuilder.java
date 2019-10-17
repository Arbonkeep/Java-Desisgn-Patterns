package com.arbonkeep.Builder.improve;
//�����࣬�������Ƿ�������
public abstract class HouseBuilder {
	House house = new House();//��Ϊ����Ϲ�ϵ������Ҫnew
	
	public abstract void buildBasic();
	
	public abstract void buildWall();
	
	public abstract void roofed();
	
	//�����ӷ���
	public House build() {
		return house;
	}
}
