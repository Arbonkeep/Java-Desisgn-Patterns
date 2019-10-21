package com.arbonkeep.decorator;

public class Decorator extends Drink {
	private Drink obj;
	
	//构造方法(通过构造器将对象传进来)
	public Decorator(Drink obj) {//组合
		this.obj = obj; 
	}
	
	@Override
	public float cost() {
		//获取到自身的价格以及父类的价格
		return super.getPrice() + obj.cost();
	}
	
	public String getDesc() {
		return super.desc + " " + super.getPrice() + " && " + obj.getDesc();
		//obj.getDesc()输出被装饰者的信息
	}

}
	