package com.arbonkeep.command;

public class TVOnCommand implements Command{
	private TVReceiver tv;

	//���췽��
	public TVOnCommand(TVReceiver tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
		
	}

	@Override
	public void undo() {
		tv.off();
		
	}
}
