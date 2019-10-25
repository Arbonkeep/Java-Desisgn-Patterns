package com.arbonkeep.command;
//ң������ң������ʼΪ5�鰴ť��
public class RemoteController {
	//�����ذ�ť����������
	Command[] onCommands;
	Command[] offCommands;
	
	//ִ�г���������
	Command undoCommand;
	
	//ͨ�����췽����ɶ԰�ť�ĳ�ʼ��
	public RemoteController() {
		onCommands = new Command[5];//��ʼ����Ϊ5
		offCommands = new Command[5];
		
		//��ʼ�������е�����
		for(int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();//ʹ�ÿ������������Ԫ�صĳ�ʼ��
			offCommands[i] = new NoCommand();
		}
	}
	
	//Ϊ��ť������Ҫ������(num��ʾΪ�ڼ��������������)
	public void setCommand(int num, Command onCommand, Command offCommand) {
		onCommands[num] = onCommand;//���ÿ�������
		offCommands[num] = offCommand;//���ùص�����
	}
	
	//���¿���ť(num��ʾ�ڼ��鰴ť)
	public void onButtonWasPushed(int num) {
		//��ʾ�ҵ����µĿ��İ�ť,��ִ����Ӧ�ķ���
		onCommands[num].execute();
		
		//��Ҫ��¼��β��������ڳ�����ť
		undoCommand = onCommands[num];
	}
	
	//���¹صİ�ť
	public void offButtonWasPushed(int num) {
		offCommands[num].execute();
		
		undoCommand = offCommands[num];
	}
	
	//���³�����ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
