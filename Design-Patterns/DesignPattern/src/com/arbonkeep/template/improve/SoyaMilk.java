package com.arbonkeep.template.improve;

public abstract class SoyaMilk {
	//����ִ�����̵ķ�����final����
	public final void make() {
		select();
		if(isAddCondiments()) {
			addCondiments();
		}
		soak();
		beat();
	}
	
	public void select() {
		System.out.println("ѡ���ϺõĻƶ�");
	}
	
	public abstract void addCondiments();
	
	public void soak() {
		System.out.println("���ƶ���ԭ�Ͻ��н��ݣ���3Сʱ");
	}
	
	public void beat() {
		System.out.println("��ʼ��������");
	}
	
	//���ӷ����������Ƿ���Ҫ�������
	public boolean isAddCondiments() {
		return true;//Ĭ����Ҫ���
	}
}
