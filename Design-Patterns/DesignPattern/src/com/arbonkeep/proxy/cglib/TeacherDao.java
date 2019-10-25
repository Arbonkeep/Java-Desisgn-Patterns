package com.arbonkeep.proxy.cglib;

public class TeacherDao {
	public String teach() {
		System.out.println("教授课程，我是cglib代理，不需要实现接口");
		
		return "hello";
	}
}
