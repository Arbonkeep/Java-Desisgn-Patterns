package com.arbonkeep.visitor;
//˵��
//1.����������ʹ����˫���ɣ��������ڿͻ��˳����У�������״̬��Ϊ��������man�У���һ�η��ɣ�
//2.Ȼ��Man�������Ϊ�����ġ����巽�����з���getManResult��ͬʱ���Լ�(this)��Ϊ��������,��ɶ��η���
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);//���ｫ�Լ����뼴��
	}

}
