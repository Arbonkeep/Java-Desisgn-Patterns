package com.arbonkeep.principle.singleresponsibility;
//��ʽ2
public class SingleResponsibility2 {
	public static void main(String[] args) {
		WaterVehicle wv = new WaterVehicle();
		wv.run("�ִ�");
		
		RoadVehicle rv = new RoadVehicle();
		rv.run("����");
		
		AirVehicle av = new AirVehicle();
		av.run("�ɻ�");
		
	}
	
}
/*
 ������
 	1. ��ʽ2��ѭ��ְ��һ��ԭ�򣬵��Ǵ��븴�������˿ͻ��Ĵ�����
 	2. �Ľ���ֱ���޸�Vehicle�࣬������������ ===> ��ʽ3
 
 */


class WaterVehicle {
	public void run(String str) {
		System.out.println(str + "��ˮ������");
	}
}

class RoadVehicle {
	public void run(String str) {
		System.out.println(str + "�ڹ�·������");
	}
}

class AirVehicle {
	public void run(String str) {
		System.out.println(str + "��ˮ������");
	}
}
