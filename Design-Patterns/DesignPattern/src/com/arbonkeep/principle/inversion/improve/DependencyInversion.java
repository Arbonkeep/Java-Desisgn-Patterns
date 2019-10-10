package com.arbonkeep.principle.inversion.improve;
/**
 * ʵ��һ��������תԭ��ĳ���
 * @author asus
 *
 */
public class DependencyInversion {

	public static void main(String[] args) {
		Person p = new Person();
		p.recieve(new Email());
		p.recieve(new WeiXin());

	}

}
//��ʽ2��ͨ����̬�Ľ���Ҳ����ʹ�ýӿڣ�����������תԭ��

interface Ireciever {
	public String getInfo();
}

//�����ʼ�
class Email implements Ireciever {
	public String getInfo() {
		return "�����ʼ�:hello,world";
	}
}

//΢��
class WeiXin implements Ireciever {
	public String getInfo() {
		return "΢����Ϣ�����ѽ";
	}
}

class Person {
	//�Խӿڵ�����
	public void recieve(Ireciever i) {
		System.out.println(i.getInfo());
	}
}
