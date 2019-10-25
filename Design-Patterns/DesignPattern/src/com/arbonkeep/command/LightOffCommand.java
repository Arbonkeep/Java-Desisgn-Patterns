package com.arbonkeep.command;

public class LightOffCommand implements Command{
	LightReceiver light;
	
	public LightOffCommand(LightReceiver light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// ���ڹرյ�ƶ��ԣ�ִ�о���ִ�н����ߵ�off
		light.off();
		
	}

	@Override
	public void undo() {
		// ���ڹرյ�ƶ��ԣ���������ִ�н����ߵ�on
		light.on();
		
	} 
	
	
}
