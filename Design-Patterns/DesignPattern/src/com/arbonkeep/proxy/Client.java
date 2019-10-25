package com.arbonkeep.proxy;

import com.arbonkeep.proxy.staticproxy.TeacherDao;
import com.arbonkeep.proxy.staticproxy.TeacherDaoProxy;

public class Client {
	public static void main(String[] args) {
		TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
		
		proxy.teach();//使用时，通过调用代理类的方法来实现目标类的功能
		
	}
}
