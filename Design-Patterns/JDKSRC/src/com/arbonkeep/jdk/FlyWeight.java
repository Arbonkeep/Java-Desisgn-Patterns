package com.arbonkeep.jdk;

public class FlyWeight {
	public static void main(String[] args) {
		//���Integer.valueOf��-128~127֮�䣬��ʹ����Ԫģʽ���أ�������ڷ�Χ�ھ�ֱ��new
		
		//С��:
		//1. ��ValueOf���������ж�ֵ�Ƿ���IntegerCache�У�������ھ���ֱ��new
		//2.ValueOf��ʹ������Ԫģʽ
		//3.���ʹ��ValueOf�����õ�һ��Integerʵ������Χ��-128~127֮�䣬��ô�ٶȱ�new��
		Integer x = Integer.valueOf(127);
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		
		System.out.println(x.equals(y));//true
		
		System.out.println(x == y);//false
		System.out.println(x == z);//true
		System.out.println(w == x);//false
		System.out.println(w == y);//false
		
		System.out.println("---------------------------");
		
		//����(ǰ��Ϊflase����Ϊfalse����ΪvalueOf��-128~127֮��ʹ�õ�����Ԫģʽ)
		System.out.println(Integer.valueOf(200) == Integer.valueOf(200));
		System.out.println(Integer.valueOf(126) == Integer.valueOf(126));
		
	}
}
