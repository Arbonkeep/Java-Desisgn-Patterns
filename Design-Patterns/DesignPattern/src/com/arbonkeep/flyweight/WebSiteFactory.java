package com.arbonkeep.flyweight;
//网站工厂类

import java.util.HashMap;

public class WebSiteFactory {
	//有一个集合相当于池子存储WebSite
	private HashMap<String, WebSite> pool = new HashMap<String, WebSite>();
	
	//根据网站的类型返回一个网站，如果没有该网站就创建一个，然后返回
	
	public WebSite getWebSiteCategory(String type) {
		//如果池子中没有就创建一个然后返回
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		
		
		return (WebSite)pool.get(type);
	}
	
	//获取网站分类的总数
	public int getWebSiteCount() {
		return pool.size();
	}
}
