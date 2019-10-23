package com.arbonkeep.composite;

public class Department extends OrganizationComponent{
	//由于本类在大学这个体系的树形结构中是一个叶子节点所以不需要继续管理下面元素
	//所以不需要定义list

	public Department(String name, String desc) {
		super(name, desc);	
	}
	
	//同样add和remove方法也不需要重写
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}


	@Override
	public void print() {
		System.out.println(getName());
	}

}
