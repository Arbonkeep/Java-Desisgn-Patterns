package com.arbonkeep.flyweight;

public class Client {
	public static void main(String[] args) {
		
		WebSiteFactory factory = new WebSiteFactory();

		//�ͻ�Ҫ�����ŷ�ʽ������վ
		WebSite web1 = factory.getWebSiteCategory("����");	
		web1.use(new User("tom"));
		
		//�ͻ�Ҫ�Բ��ͷ�ʽ������վ
		WebSite web2 = factory.getWebSiteCategory("����");		
		web1.use(new User("mark"));
		
		//�ͻ�Ҫ�Բ��ͷ�ʽ������վ
		WebSite web3 = factory.getWebSiteCategory("����");		
		web1.use(new User("jack"));
		
		//��ȡ�ܵķ�����ʽ�м���
		int count = factory.getWebSiteCount(); 
		
		System.out.println(count);
	}
}
