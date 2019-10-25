package com.arbonkeep.command;

public class TVOffCommand implements Command{
	private TVReceiver tv;

	//���췽��
	public TVOffCommand(TVReceiver tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
		
	}

	@Override
	public void undo() {
		tv.on();
		
	}
	
	
}
