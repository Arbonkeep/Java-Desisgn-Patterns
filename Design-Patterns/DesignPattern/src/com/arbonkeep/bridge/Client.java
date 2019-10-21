package com.arbonkeep.bridge;
/**
 * �����Phone�൱���ţ��Ž���������
 * @author asus
 *
 */
public class Client {
	public static void main(String[] args) {
		//С���ֻ����۵���ʽ���ֻ�
		Phone p = new FoldedPhone(new XiaoMi());
		//���÷���
		p.call();
		p.close();
		p.open();
		
		System.out.println("-------------------------");
		
		//Vivo�ֻ����۵���ʽ���ֻ�
		Phone p2 = new UprightPhone(new Vivo());
		
		p2.call();
		p2.close();
		p2.open();
		
	}
}
