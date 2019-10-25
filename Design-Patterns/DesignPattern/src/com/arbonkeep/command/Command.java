package com.arbonkeep.command;

public interface Command {
	public void execute();
	
	public void undo();
}
