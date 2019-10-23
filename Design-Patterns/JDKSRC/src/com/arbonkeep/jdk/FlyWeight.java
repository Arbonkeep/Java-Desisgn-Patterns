package com.arbonkeep.jdk;

public class FlyWeight {
	public static void main(String[] args) {
		//如果Integer.valueOf在-128~127之间，就使用享元模式返回，如果不在范围内就直接new
		
		//小结:
		//1. 在ValueOf方法中先判断值是否在IntegerCache中，如果不在就自直接new
		//2.ValueOf就使用了享元模式
		//3.如果使用ValueOf方法得到一个Integer实例，范围在-128~127之间，那么速度比new快
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
		
		//测试(前者为flase后者为false是因为valueOf在-128~127之间使用到了享元模式)
		System.out.println(Integer.valueOf(200) == Integer.valueOf(200));
		System.out.println(Integer.valueOf(126) == Integer.valueOf(126));
		
	}
}
