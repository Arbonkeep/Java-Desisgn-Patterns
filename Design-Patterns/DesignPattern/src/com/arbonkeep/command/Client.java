package com.arbonkeep.command;

public class Client {
	public static void main(String[] args) {
		//使用命令设计模式，完成通过遥控器对电灯执行操作
		
		//1.创建电灯对象（接收者）
		LightReceiver lightReceiver = new LightReceiver();
		
		//2.创建电灯的开关命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		
		//3.获取遥控器对象
		RemoteController controller = new RemoteController();
		
		//4.为遥控器设置相关命令(num=0是电灯的开和gaunt操作)
		controller.setCommand(0, lightOnCommand, lightOffCommand);
		
		//5.按下按钮执行命令
		//5.1打开电灯
		System.out.println("-----------open lamb----------");
		controller.onButtonWasPushed(0);
		//5.2关闭电灯
		System.out.println("-----------close lamb------------");
		controller.offButtonWasPushed(0);
		//5.2撤销执行
		System.out.println("-----------undo------------");
		controller.undoButtonWasPushed();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//使用遥控器控制电视
		//1.创建电视对象
		TVReceiver tvReceiver = new TVReceiver();
		//2.创建电视开关的命令
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		//3.设置命令（第2组为电视开关命令）
		controller.setCommand(1, tvOnCommand, tvOffCommand);
		//4.按下按钮执行
		System.out.println("-----------open tv----------");
		controller.onButtonWasPushed(1);
		System.out.println("-----------close tv----------");
		controller.offButtonWasPushed(1);
		System.out.println("-----------open tv----------");
		controller.undoButtonWasPushed();
		
		
		
	}
}
