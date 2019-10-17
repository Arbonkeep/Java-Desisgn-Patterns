package com.arbonkeep.Builder.improve;
//�ͻ���
public class Client {
	public static void main(String[] args) {
		//������ͨ����
		CommonHouse commonHouse = new CommonHouse();
		
		//�ҵ�������ͨ���ӵ�ָ����
		HouseDirector director = new HouseDirector(commonHouse);
		
		//��ɸǷ��ӣ��������ӷ���
		director.createHouse();
		
		System.out.println("-----------------------");
		
		//������¥
		HighBuilding building = new HighBuilding();
		
		//�ҵ�������¥��ָ����
		HouseDirector director2 = new HouseDirector(building);
		
		//��ɸǷ��ӣ��������ӷ���
		director2.createHouse();
		
	}
}
