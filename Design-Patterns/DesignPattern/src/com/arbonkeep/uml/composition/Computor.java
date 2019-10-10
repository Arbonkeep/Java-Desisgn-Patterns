package com.arbonkeep.uml.composition;

public class Computor {
	private Monitor monitor;
	
	private Mouse mouse;

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	
}
