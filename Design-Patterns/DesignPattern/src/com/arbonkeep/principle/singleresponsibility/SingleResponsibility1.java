package com.arbonkeep.principle.singleresponsibility;
/**
 * ��ʾ��һְ��ԭ��
 * @author asus
 *
 */
public class SingleResponsibility1 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("��");
		vehicle.run("�ɻ�");
		vehicle.run("�ִ�");
	}

}
/*
 ������
 	1.�ڷ�ʽ 1��Υ����ְ��һԭ��
 	2.��������������ֽܷ�ɲ�ͬ����===> ��ʽ2
 */
class Vehicle {
	
	public void run(String vehicle) {
		System.out.println(vehicle + "�ڹ�·������");
	}
	

}
