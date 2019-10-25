package com.arbonkeep.command;

public class LightOnCommand implements Command {
	//聚合LightReciver
	LightReceiver light;
	
	//通过构造方法将light传入
	public LightOnCommand(LightReceiver light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		//对于打开电灯名命令而言，执行默认就是on
		light.on();
	}

	@Override
	public void undo() {
		//对于打开电灯命令而言，撤销就是off
		light.off();
		
	}

}
