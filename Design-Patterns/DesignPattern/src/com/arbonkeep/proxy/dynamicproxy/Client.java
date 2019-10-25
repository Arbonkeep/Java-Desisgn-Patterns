package com.arbonkeep.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		//����Ŀ�����
		TeacherDao target = new TeacherDao();
		
		//ΪĿ����󴴽�����ԣ���Ҫǿת��ITeacherDao����(���ܹ�����Ŀ����󷽷�)
		ITeacherDao obj = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//com.sun.proxy.$Proxy0,�ڴ��ж�̬�����˴������
		System.out.println("proxyInstance=" + obj.getClass());
		
		//ͨ������������Ŀ����󷽷�
		obj.teach();
	}
}
