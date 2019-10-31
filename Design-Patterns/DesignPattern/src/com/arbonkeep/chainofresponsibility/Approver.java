package com.arbonkeep.chainofresponsibility;

public abstract class Approver {
	Approver approver;//下一个接收处理者
	
	String name;
	
	//构造方法
	public Approver(String name) {
		this.name = name;
	}
	
	//设置下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	//处理请求的方法，具体的请求在子类处理，定义成抽象方法
	public abstract void processRequest(PurchaseRequest purchaseRequest);

	
}	
