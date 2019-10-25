package com.arbonkeep.proxy.staticproxy;
//代理类(调用本类对象的方法)
public class TeacherDaoProxy implements ITeacherDao {
	private ITeacherDao target;//目标对象，通过接口来聚合
	
	//通过构造方法将目标对象传入
	public TeacherDaoProxy( ITeacherDao target) {
		this.target = target;
	}
	
	@Override
	public void teach() {
		//在本方法中可以实现其他逻辑
		System.out.println("开始代理，完成某些操作。。。。");
		
		target.teach();//在这里调用目标对象的方法完成教学功能
		
		System.out.println("提交");
	}

}
