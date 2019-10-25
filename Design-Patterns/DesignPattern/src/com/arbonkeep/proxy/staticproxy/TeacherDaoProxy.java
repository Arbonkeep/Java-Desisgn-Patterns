package com.arbonkeep.proxy.staticproxy;
//������(���ñ������ķ���)
public class TeacherDaoProxy implements ITeacherDao {
	private ITeacherDao target;//Ŀ�����ͨ���ӿ����ۺ�
	
	//ͨ�����췽����Ŀ�������
	public TeacherDaoProxy( ITeacherDao target) {
		this.target = target;
	}
	
	@Override
	public void teach() {
		//�ڱ������п���ʵ�������߼�
		System.out.println("��ʼ�������ĳЩ������������");
		
		target.teach();//���������Ŀ�����ķ�����ɽ�ѧ����
		
		System.out.println("�ύ");
	}

}
