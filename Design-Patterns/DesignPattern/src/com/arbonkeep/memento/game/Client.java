package com.arbonkeep.memento.game;

public class Client {
	public static void main(String[] args) {
		//1.������Ϸ��ɫ����
		GameRole gameRole = new GameRole();
		//��ʼ״̬�Ĺ����������������100
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("��ʼ״̬");
		gameRole.display();
		
		
		//2.�����ػ��߶���
		Caretaker caretaker = new Caretaker();
		
		//3.���ý�ɫ����ķ�������һ������¼���󣬲������ػ��߶����setMemento�������ñ���¼����
		caretaker.setMemento(gameRole.createMemento());
		
		//4.����ս������Ϸ��ɫ��״̬ 
		System.out.println("����ս������Ϸ��ɫ��״̬ ");
		gameRole.setVit(30);
		gameRole.setDef(30);
		gameRole.display();
		
		//5.�ָ�����ʼ״̬
		System.out.println("�ָ�����ʼ״̬");
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
		gameRole.display();
		
		
	}
}
