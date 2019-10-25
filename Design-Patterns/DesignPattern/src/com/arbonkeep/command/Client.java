package com.arbonkeep.command;

public class Client {
	public static void main(String[] args) {
		//ʹ���������ģʽ�����ͨ��ң�����Ե��ִ�в���
		
		//1.������ƶ��󣨽����ߣ�
		LightReceiver lightReceiver = new LightReceiver();
		
		//2.������ƵĿ�������
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		
		//3.��ȡң��������
		RemoteController controller = new RemoteController();
		
		//4.Ϊң���������������(num=0�ǵ�ƵĿ���gaunt����)
		controller.setCommand(0, lightOnCommand, lightOffCommand);
		
		//5.���°�ťִ������
		//5.1�򿪵��
		System.out.println("-----------open lamb----------");
		controller.onButtonWasPushed(0);
		//5.2�رյ��
		System.out.println("-----------close lamb------------");
		controller.offButtonWasPushed(0);
		//5.2����ִ��
		System.out.println("-----------undo------------");
		controller.undoButtonWasPushed();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//ʹ��ң�������Ƶ���
		//1.�������Ӷ���
		TVReceiver tvReceiver = new TVReceiver();
		//2.�������ӿ��ص�����
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		//3.���������2��Ϊ���ӿ������
		controller.setCommand(1, tvOnCommand, tvOffCommand);
		//4.���°�ťִ��
		System.out.println("-----------open tv----------");
		controller.onButtonWasPushed(1);
		System.out.println("-----------close tv----------");
		controller.offButtonWasPushed(1);
		System.out.println("-----------open tv----------");
		controller.undoButtonWasPushed();
		
		
		
	}
}
