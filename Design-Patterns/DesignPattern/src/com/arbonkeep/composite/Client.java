package com.arbonkeep.composite;
//ʹ�ö�
public class Client {
	public static void main(String[] args) {
		//�Ӵ�С��ȡ
		//��ȡUniversity
		OrganizationComponent university = new University("�����ѧ", "����ѧУ");
		
		//���college
		OrganizationComponent ComputerCollege = new College("�����ѧԺ", "�����ѧԺ");
		OrganizationComponent infoCollege = new College("��ϢѧԺ", "��ϢѧԺ");
		
		university.add(ComputerCollege);
		university.add(infoCollege);
		
		//Ϊ�����ѧԺ���ϵ��רҵ��
		OrganizationComponent department1 = new Department("�������", "������̺ܸ߶�");
		OrganizationComponent department2= new Department("�������ѧ�뼼��", "�������ѧ�뼼���ܺ�");
		OrganizationComponent department3= new Department("���������", "���������");
		
		ComputerCollege.add(department1);
		ComputerCollege.add(department2);
		ComputerCollege.add(department3);
		
		//Ϊ��ϢѧԺ���ϵ
		
		OrganizationComponent department4 = new Department("ͨ�Ź���", "ͨ�Ź���");
		OrganizationComponent department5 = new Department("��Ϣ����", "��Ϣ����");
		OrganizationComponent department6 = new Department("��Ϣ��ȫ", "��Ϣ��ȫ");
		
		infoCollege.add(department4);
		infoCollege.add(department5);
		infoCollege.add(department6);
		
		//����print������ӡ��ע�⣺�����ĸ���ξͻ���ʾ��������а��������ݣ�
		
		university.print();
	}
	
}
