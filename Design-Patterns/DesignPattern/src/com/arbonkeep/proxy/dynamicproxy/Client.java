package com.arbonkeep.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		//创建目标对象
		TeacherDao target = new TeacherDao();
		
		//为目标对象创建代理对，需要强转成ITeacherDao类型(才能够调用目标对象方法)
		ITeacherDao obj = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//com.sun.proxy.$Proxy0,内存中动态生成了代理对象
		System.out.println("proxyInstance=" + obj.getClass());
		
		//通过代理对象调用目标对象方法
		obj.teach();
	}
}
