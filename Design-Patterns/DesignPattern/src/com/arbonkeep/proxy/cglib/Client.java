package com.arbonkeep.proxy.cglib;

public class Client {
	public static void main(String[] args) {
		//1.����Ŀ�����
		TeacherDao dao = new TeacherDao();
		
		//2.��ȡ������󣬲���Ŀ����󴫵ݸ��������
		ProxyFactory factory = new ProxyFactory(dao);
		
		//3.���û�ȡʵ���ķ���
		TeacherDao proxyInstance  = (TeacherDao)factory.getProxyInstance();
		
		//4.ִ�д������ķ���������intercept�������Ӷ�ʵ�ֶ�Ŀ�����ĵ���
		String str = proxyInstance.teach();//�˴����õķ���ֵ��Ŀ�����ķ���ֵ�й�
		
		System.out.println(str);
	}
}
