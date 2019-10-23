package com.arbonkeep.flyweight;

public class ConcreteWebSite extends WebSite {
	private String type = "";//网站发布的
	
	public ConcreteWebSite(String type) {
		this.type = type;
	}
	
	@Override
	public void use(User user) {
		System.out.println("网站以" + type + "的形式发布，使用者是" + user.getName());
	}

}
