package com.arbonkeep.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

//�ػ��߶���
public class Caretaker {
	//ֻ����һ��״̬
	private Memento memento;
	//��GameRole������״̬
	//private ArrayList<Memento> list;
	//�Զ����Ϸ��ɫ������״̬
	//private HashMap<String, ArrayList<Memento>> map;
	
	
	//����һ��memento����
	public Memento getMemento() {
		return memento;
	}
	
	//��memento����Ϊ�����Memento������ֻ����һ��״̬�������
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
