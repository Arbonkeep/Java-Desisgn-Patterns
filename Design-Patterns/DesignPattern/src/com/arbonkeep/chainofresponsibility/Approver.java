package com.arbonkeep.chainofresponsibility;

public abstract class Approver {
	Approver approver;//��һ�����մ�����
	
	String name;
	
	//���췽��
	public Approver(String name) {
		this.name = name;
	}
	
	//������һ��������
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	//��������ķ�������������������ദ������ɳ��󷽷�
	public abstract void processRequest(PurchaseRequest purchaseRequest);

	
}	
