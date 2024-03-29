package com.arbonkeep.chainofresponsibility;

public class SchoolApprover extends Approver{

	public SchoolApprover(String name) {
		super(name);
		
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() >= 30000) {
			System.out.println("审批者：" + this.name + "对" + purchaseRequest.getId() + "号请求进行处理");
		}else {
			//指定下一个审批者
			approver.processRequest(purchaseRequest);
		}
		
	}

}
