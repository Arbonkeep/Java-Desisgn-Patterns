package com.arbonkeep.principle.singleresponsibility;
//��ʽ3
public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2();
		v.roadRun("����");
		v.waterRun("�ִ�");
		v.airRun("�ɻ�");
	}
}
/*
 ������
 	1. ���ַ�ʽû�ж�ԭ����������޸ģ�ֻ�������˷���
 	2. �����ʽ��Ȼû������ļ�������ѭְ��һԭ�򣬵����ڷ��������ϣ�Ҳ����ѭ��ְ��һԭ��
  */

class Vehicle2 {
	public void waterRun(String str) {
		System.out.println(str + "��ˮ������");
	}
	
	public void roadRun(String str) {
		System.out.println(str + "�ڹ�·������");
	}
	
	public void airRun(String str) {
		System.out.println(str + "�����������");
	}
}
