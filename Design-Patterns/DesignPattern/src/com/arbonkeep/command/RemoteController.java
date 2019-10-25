package com.arbonkeep.command;
//遥控器（遥控器初始为5组按钮）
public class RemoteController {
	//开、关按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;
	
	//执行撤销的命令
	Command undoCommand;
	
	//通过构造方法完成对按钮的初始化
	public RemoteController() {
		onCommands = new Command[5];//初始容量为5
		offCommands = new Command[5];
		
		//初始化数组中的内容
		for(int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();//使用空命令完成数组元素的初始化
			offCommands[i] = new NoCommand();
		}
	}
	
	//为按钮设置需要的命令(num表示为第几组命令进行设置)
	public void setCommand(int num, Command onCommand, Command offCommand) {
		onCommands[num] = onCommand;//设置开的命令
		offCommands[num] = offCommand;//设置关的命令
	}
	
	//按下开按钮(num表示第几组按钮)
	public void onButtonWasPushed(int num) {
		//表示找到按下的开的按钮,并执行相应的方法
		onCommands[num].execute();
		
		//需要记录这次操作，用于撤销按钮
		undoCommand = onCommands[num];
	}
	
	//按下关的按钮
	public void offButtonWasPushed(int num) {
		offCommands[num].execute();
		
		undoCommand = offCommands[num];
	}
	
	//按下撤销按钮
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
