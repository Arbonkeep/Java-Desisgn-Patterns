package com.arbonkeep.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
	List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();
	
	//构造方法
	public College(String name, String desc) {
		super(name, desc);
		
	}
	
	//add
	//需要注意的是将来实际业务中，College得add与University中的add不是完全一样的
	@Override
	public void add(OrganizationComponent oc) {
		list.add(oc);
	}
	
	//remove
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

	@Override
	public void print() {
		System.out.println("-------------" + getName() + "--------------");
		
		for (OrganizationComponent organizationComponent : list) {
			organizationComponent.print();
		}
		
	}

}
