package com.arbonkeep.command;

public class LightOnCommand implements Command {
	//�ۺ�LightReciver
	LightReceiver light;
	
	//ͨ�����췽����light����
	public LightOnCommand(LightReceiver light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		//���ڴ򿪵����������ԣ�ִ��Ĭ�Ͼ���on
		light.on();
	}

	@Override
	public void undo() {
		//���ڴ򿪵��������ԣ���������off
		light.off();
		
	}

}
