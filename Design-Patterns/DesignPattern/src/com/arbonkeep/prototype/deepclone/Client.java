package com.arbonkeep.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		
		p.name = "����";
		p.dp01 = new DeepClone01("����", "С��");
		
		//1.ʹ�÷�ʽ1������
//		DeepProtoType p2 = (DeepProtoType)p.clone();
//		
//		System.out.println("p.name = " + p.name + "p.dp01.hashCode() = " + p.dp01.hashCode() );
//		System.out.println("p2.name = " + p.name + "p.dp02.hashCode() = " + p2.dp01.hashCode() );
		
		//����hashCode�����˵������������ͬһ����������˶�������
		
		//ʹ�÷�ʽ2������
		
		DeepProtoType p2 = (DeepProtoType)p.deepClone();
		
		System.out.println("p.name = " + p.name + "p.dp01.hashCode() = " + p.dp01.hashCode() );
		System.out.println("p.name = " + p2.name+ "p.dp02.hashCode() = " + p2.dp01.hashCode() );
	
		
		
	}
}
