package com.arbonkeep.principle.inversion;

import javax.management.openmbean.OpenDataException;

/**
 * ����ʵ�������������ַ�ʽ���������ַ�ʽ�����˲���
 * @author asus
 *
 */
public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangHong changHong = new ChangHong();
		//��ʽ1:ͨ���ӿڴ��ݲ���
//		OpenAndClose o = new OpenAndClose();
//		o.open(changHong);
		
		//��ʽ2:ͨ�����췽�����ݲ���
//		OpenAndClose o = new OpenAndClose(changHong);
//		o.open();
		
		//��ʽ3:ͨ��setter�������ݲ���
		OpenAndClass o = new OpenAndClass();
		o.set(changHong);//������Ҫͨ��setter�������������ݽ�ȥ
		o.open();
		
	}

}

class ChangHong implements ITV {
	public void play() {
		System.out.println("������ӻ�����ʼ����");
	}
}

////��ʽ1��ͨ���ӿ�ʵ������
//interface IOpenAndClose {
//	public void open(ITV tv);//��ITV����ͨ���ӿڴ���
//}
//
//interface ITV {
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public void open(ITV tv) {
//		tv.play();
//	}
//}

////��ʽ2��ͨ�����췽��ʵ������
//
//interface IOpenAndClose {
//	public void open();
//}
//
//interface ITV {
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//	
//	public OpenAndClose(ITV tv) {//ͨ�����췽����������
//		
//		this.tv = tv;
//	}
//	
//	public void open() {
//		this.tv.play();
//	}
//}

//��ʽ3ͨ��setter����ʵ������

interface IOpenAndeClose {
	public void open();
}

interface ITV {
	public void play();
}

class OpenAndClass implements IOpenAndeClose {
	private ITV tv;
	
	public void set(ITV tv) {
		this.tv = tv;
	}
	
	public void open() {
		tv.play();
	}
}
