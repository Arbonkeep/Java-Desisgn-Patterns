package com.arbonkeep.uml.aggregation;

public class Computor {
	//�������ʾ���͵���֮���ǲ��ɷ����
	private Monitor monitor = new Monitor();
	
	private Mouse mouse = new Mouse();

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	
}
