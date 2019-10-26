package com.arbonkeep.visitor;
//说明
//1.在这里我们使用了双分派，即首先在客户端程序中，将具体状态作为参数传递man中（第一次分派）
//2.然后Man类调用作为参数的“具体方法”中方法getManResult，同时将自己(this)作为参数传入,完成二次分派
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);//这里将自己传入即可
	}

}
