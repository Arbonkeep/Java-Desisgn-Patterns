package com.arbonkeep.composite;

public abstract class OrganizationComponent {
	private String name;//名字
	
	private String desc;//描述
	
	public void add(OrganizationComponent oc) {
		//默认实现
		throw new UnsupportedOperationException("error");
	}
	
	public void remove(OrganizationComponent oc) {
		//默认实现
		throw new UnsupportedOperationException("error");
	}

	//提供构造方法
	public OrganizationComponent(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	
	//提供set和get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	//print方法
	public abstract void print();
	
	
	

}
