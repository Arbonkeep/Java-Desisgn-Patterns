package com.arbonkeep.chainofresponsibility;

public class DepartmentApprover extends Approver{

	//���췽��
	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() < 5000) {
			System.out.println("�����ߣ�" + this.name + "��" + purchaseRequest.getId() + "��������д���");
		}else {
			//ָ����һ��������
			approver.processRequest(purchaseRequest);
		}
		
		
	}

}
