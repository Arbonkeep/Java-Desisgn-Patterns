package com.arbonkeep.state;

public class Client {
	public static void main(String[] args) {
		//���������ָ����ƷΪ1
		Activity activity = new Activity(1);
		
		//�齱30��
		for (int i = 0; i < 30; i++) {
			System.out.println("-------------��" + (i + 1) + "�γ齱-------------");
			activity.debuctMoney();//�ۻ���
			activity.raffle();//�齱
		}
	}
}
