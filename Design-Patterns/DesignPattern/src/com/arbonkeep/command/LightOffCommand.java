package com.arbonkeep.command;

public class LightOffCommand implements Command{
	LightReceiver light;
	
	public LightOffCommand(LightReceiver light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// 对于关闭电灯而言，执行就是执行接收者的off
		light.off();
		
	}

	@Override
	public void undo() {
		// 对于关闭电灯而言，撤销就是执行接收者的on
		light.on();
		
	} 
	
	
}
