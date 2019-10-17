package com.arbonkeep.Builder.improve;
//客户端
public class Client {
	public static void main(String[] args) {
		//创建普通房子
		CommonHouse commonHouse = new CommonHouse();
		
		//找到创建普通房子的指挥者
		HouseDirector director = new HouseDirector(commonHouse);
		
		//完成盖房子，并将房子返回
		director.createHouse();
		
		System.out.println("-----------------------");
		
		//创建高楼
		HighBuilding building = new HighBuilding();
		
		//找到创建高楼的指挥者
		HouseDirector director2 = new HouseDirector(building);
		
		//完成盖房子，并将房子返回
		director2.createHouse();
		
	}
}
