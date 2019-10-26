package com.arbonkeep.visitor;

public class Client {
	public static void main(String[] args) {
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		//����һ�����˺Ϳ�һ��Ů��
		objectStructure.attach(new Man());//��������ӵ�ObjectStructure
		objectStructure.attach(new Woman());
		
		//�ɹ�������
		Success success = new Success();
		objectStructure.display(success);//չʾ�ɹ�������(�����������������ɹ�������)
		
		System.out.println("-------------------------------");
		
		//ʧ�ܵ�����
		Fail fail = new Fail();
		objectStructure.display(fail);//չʾʧ�ܵ�����
		
		System.out.println("----------------------------");
		//wait������
		Wait wait = new Wait();
		objectStructure.display(wait);
	}
}
