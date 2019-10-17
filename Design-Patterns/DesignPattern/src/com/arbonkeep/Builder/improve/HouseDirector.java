package com.arbonkeep.Builder.improve;
//ָ������,ָ���������̷��ز�Ʒ
public class HouseDirector {
	HouseBuilder houseBuilder = null;//��Ϊ�ǾۺϹ�ϵ����Ϊnull
	
	//����������houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//ͨ��set��������HouseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//��δ�������
	public House createHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWall();
		houseBuilder.roofed();
		
		return houseBuilder.build();
	}
	
	
	
}
