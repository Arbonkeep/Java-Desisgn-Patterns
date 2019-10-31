package com.arbonkeep.chainofresponsibility;

public class ViceSchoolApprover extends Approver {

	public ViceSchoolApprover(String name) {
		super(name);
		
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
			System.out.println("�����ߣ�" + this.name + "��" + purchaseRequest.getId() + "��������д���");
		}else {
			//ָ����һ��������
			approver.processRequest(purchaseRequest);
		}
		
	}

}
