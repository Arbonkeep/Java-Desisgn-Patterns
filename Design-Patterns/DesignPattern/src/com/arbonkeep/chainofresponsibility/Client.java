package com.arbonkeep.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		//1.创建请求对象
		PurchaseRequest purchaseRequest = new PurchaseRequest(12, 25000.0f, 1);
		
		//2.创建审批者对象
		DepartmentApprover departmentApprover = new DepartmentApprover("李主任");
		CollegeApprover collegeApprover = new CollegeApprover("王院长");
		ViceSchoolApprover viceSchoolApprover = new ViceSchoolApprover("赵副校长");
		SchoolApprover schoolApprover = new SchoolApprover("张校长");
		
		//3.指定下一个审批者（需要循环指定，以便于在高层访问时可以审批成功）
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolApprover);
		viceSchoolApprover.setApprover(schoolApprover);
		schoolApprover.setApprover(departmentApprover);
		
		//4.调用方法审批
		departmentApprover.processRequest(purchaseRequest);
	}
	
}
