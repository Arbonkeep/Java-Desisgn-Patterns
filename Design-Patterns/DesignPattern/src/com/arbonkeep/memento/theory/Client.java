package com.arbonkeep.memento.theory;

public class Client {
	public static void main(String[] args) {
		//����ԭʼ����
		Originator originator = new Originator();
		//�����ػ��߶��󣨴洢�˶��ԭʼ����
		Caretaker caretaker = new Caretaker();
		
		//����ԭʼ�����״̬
		originator.setState("״̬һ:������1000");
		//���ö���״̬������ӵ������У���һ�α��棩
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("״̬��:������800");
		//���ö���״̬������ӵ������У��ڶ��α��棩
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("״̬��:������500");
		//���ö���״̬������ӵ������У������α��棩
		caretaker.add(originator.saveStateMemento());
		
		//��ǰ״̬
		System.out.println("��ǰ״̬�ǣ�" + originator.getState());
		
		//�ָ�����һ�α����״̬
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("��ǰ״̬�ǣ�" + originator.getState());
			
	}
}
