package com.arbonkeep.chainofresponsibility;

public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		super(name);
		
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
			System.out.println("�����ߣ�" + this.name + "��" + purchaseRequest.getId() + "��������д���");
		}else {
			//ָ����һ��������
			approver.processRequest(purchaseRequest);
		}
		
	}

}
