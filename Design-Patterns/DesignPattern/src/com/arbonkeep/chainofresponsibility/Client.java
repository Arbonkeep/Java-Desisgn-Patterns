package com.arbonkeep.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		//1.�����������
		PurchaseRequest purchaseRequest = new PurchaseRequest(12, 25000.0f, 1);
		
		//2.���������߶���
		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolApprover viceSchoolApprover = new ViceSchoolApprover("�Ը�У��");
		SchoolApprover schoolApprover = new SchoolApprover("��У��");
		
		//3.ָ����һ�������ߣ���Ҫѭ��ָ�����Ա����ڸ߲����ʱ���������ɹ���
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolApprover);
		viceSchoolApprover.setApprover(schoolApprover);
		schoolApprover.setApprover(departmentApprover);
		
		//4.���÷�������
		departmentApprover.processRequest(purchaseRequest);
	}
	
}
