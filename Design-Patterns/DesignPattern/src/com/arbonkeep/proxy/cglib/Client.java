package com.arbonkeep.proxy.cglib;

public class Client {
	public static void main(String[] args) {
		//1.创建目标对象
		TeacherDao dao = new TeacherDao();
		
		//2.获取代理对象，并将目标对象传递给代理对象
		ProxyFactory factory = new ProxyFactory(dao);
		
		//3.调用获取实例的方法
		TeacherDao proxyInstance  = (TeacherDao)factory.getProxyInstance();
		
		//4.执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
		String str = proxyInstance.teach();//此处调用的返回值与目标对象的返回值有关
		
		System.out.println(str);
	}
}
