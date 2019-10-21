package com.arbonkeep.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		
		p.name = "张三";
		p.dp01 = new DeepClone01("李四", "小四");
		
		//1.使用方式1完成深拷贝
//		DeepProtoType p2 = (DeepProtoType)p.clone();
//		
//		System.out.println("p.name = " + p.name + "p.dp01.hashCode() = " + p.dp01.hashCode() );
//		System.out.println("p2.name = " + p.name + "p.dp02.hashCode() = " + p2.dp01.hashCode() );
		
		//两个hashCode不相等说明两个对象不是同一个对象完成了对象的深拷贝
		
		//使用方式2完成深拷贝
		
		DeepProtoType p2 = (DeepProtoType)p.deepClone();
		
		System.out.println("p.name = " + p.name + "p.dp01.hashCode() = " + p.dp01.hashCode() );
		System.out.println("p.name = " + p2.name+ "p.dp02.hashCode() = " + p2.dp01.hashCode() );
	
		
		
	}
}
