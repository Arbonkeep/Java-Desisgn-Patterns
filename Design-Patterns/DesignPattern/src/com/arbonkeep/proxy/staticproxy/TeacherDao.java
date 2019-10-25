package com.arbonkeep.proxy.staticproxy;
//目标对象类（不调用本类）
public class TeacherDao implements ITeacherDao{

	@Override
	public void teach() {
		System.out.println("老师开始授课了。。。");
		
	}
	
}
