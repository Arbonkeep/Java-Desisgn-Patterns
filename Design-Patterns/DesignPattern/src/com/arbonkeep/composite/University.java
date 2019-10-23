package com.arbonkeep.composite;


import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
	//声明集合存储添加学院信息
	List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	//构造方法
	public University(String name, String desc) {
		super(name, desc);
		
	}
	
	@Override
	public void add(OrganizationComponent oc) {
		list.add(oc);
	}
	
	@Override
	public void remove(OrganizationComponent oc) {
		list.remove(oc);
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}
	
	//重写print方法
	@Override
	public void print() {
		//首先打印一下本类的名字
		System.out.println("------------------------" + getName() + "------------------------");
		
		//然后对本类管理的内容进行遍历，也就是遍历List
		for (OrganizationComponent organizationComponent : list) {
			organizationComponent.print();
		}
	}

}
