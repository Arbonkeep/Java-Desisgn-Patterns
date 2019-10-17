package com.arbonkeep.prototype.improve;

import com.arbonkeep.prototype.improve.Sheep;

//原型模式实现Sheep类
public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	
	public Sheep friend;//演示浅拷贝
	
	//如果添加一个address属性，不再需要提供set，get方法
	private String address;
	
	public Sheep() {}
	
	public Sheep(String name , int age, String color, String address) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}

	@Override
	protected Object clone() {
		Sheep sheep = null;
		try {
			sheep = (Sheep)super.clone();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return sheep;
	}
	
	
}
