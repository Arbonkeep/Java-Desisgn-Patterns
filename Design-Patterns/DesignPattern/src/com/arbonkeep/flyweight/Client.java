package com.arbonkeep.flyweight;

public class Client {
	public static void main(String[] args) {
		
		WebSiteFactory factory = new WebSiteFactory();

		//客户要以新闻方式发布网站
		WebSite web1 = factory.getWebSiteCategory("新闻");	
		web1.use(new User("tom"));
		
		//客户要以博客方式发布网站
		WebSite web2 = factory.getWebSiteCategory("博客");		
		web1.use(new User("mark"));
		
		//客户要以博客方式发布网站
		WebSite web3 = factory.getWebSiteCategory("新闻");		
		web1.use(new User("jack"));
		
		//获取总的发布形式有几种
		int count = factory.getWebSiteCount(); 
		
		System.out.println(count);
	}
}
