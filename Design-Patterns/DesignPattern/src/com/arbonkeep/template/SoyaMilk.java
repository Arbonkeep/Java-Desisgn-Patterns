package com.arbonkeep.template;

public abstract class SoyaMilk {
	//定义执行流程的方法，final修饰
	public final void make() {
		select();
		addCondiments();
		soak();
		beat();
	}
	
	public void select() {
		System.out.println("选择上好的黄豆");
	}
	
	public abstract void addCondiments();
	
	public void soak() {
		System.out.println("将黄豆和原料进行浸泡，泡3小时");
	}
	
	public void beat() {
		System.out.println("开始制作豆浆");
	}
}
