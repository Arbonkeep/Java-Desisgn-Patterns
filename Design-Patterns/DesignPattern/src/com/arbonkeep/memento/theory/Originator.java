package com.arbonkeep.memento.theory;
//ԭʼ������Ҫ����״̬��
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//��дһ�����������Ա���һ��״̬����Memento��������Memento
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	//ͨ������¼���󣬻ָ�״̬
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	} 
}
