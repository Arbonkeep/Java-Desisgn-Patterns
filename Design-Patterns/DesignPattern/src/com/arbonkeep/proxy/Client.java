package com.arbonkeep.proxy;

import com.arbonkeep.proxy.staticproxy.TeacherDao;
import com.arbonkeep.proxy.staticproxy.TeacherDaoProxy;

public class Client {
	public static void main(String[] args) {
		TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
		
		proxy.teach();//ʹ��ʱ��ͨ�����ô�����ķ�����ʵ��Ŀ����Ĺ���
		
	}
}
