package com.arbonkeep.uml.aggregation;

public class Computor {
	//鼠标与显示器和电脑之间是不可分离的
	private Monitor monitor = new Monitor();
	
	private Mouse mouse = new Mouse();

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	
}
