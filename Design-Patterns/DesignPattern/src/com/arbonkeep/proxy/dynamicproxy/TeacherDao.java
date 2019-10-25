package com.arbonkeep.proxy.dynamicproxy;
//目标类
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println("开始授课。。。。");
		
	}

}
