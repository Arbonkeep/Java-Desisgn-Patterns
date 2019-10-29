package com.arbonkeep.memento.game;
//��Ϸ��ɫ��
public class GameRole {
	private int vit;
	private int def;
	
	//�ṩ��Ӧ��get/set������ȡ����
	public int getVit() {
		return vit;
	}

	public int getDef() {
		return def;
	}
	
	public void setVit(int vit) {
		this.vit = vit;
	}

	public void setDef(int def) {
		this.def = def;
	}

	//����һ��Memento�ķ���,���ݵ�ǰ���� ��ȡһ��Memento����
	public Memento createMemento() {
		return new Memento(vit, def);
	}
	
	//ʹ�ñ���¼����ָ�֮ǰ��״̬�ķ���
	public void recoverGameRoleFromMemento(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}
	
	//���ڴ�ӡ�����ݵķ���
	public void display() {
		System.out.println("��Ϸ��ɫ�ĵ�ǰ������Ϊ" + this.vit + "��ǰ������Ϊ" + this.def);
	}
	
}
