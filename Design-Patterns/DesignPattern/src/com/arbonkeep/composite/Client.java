package com.arbonkeep.composite;
//使用端
public class Client {
	public static void main(String[] args) {
		//从大到小获取
		//获取University
		OrganizationComponent university = new University("哈佛大学", "顶尖学校");
		
		//添加college
		OrganizationComponent ComputerCollege = new College("计算机学院", "计算机学院");
		OrganizationComponent infoCollege = new College("信息学院", "信息学院");
		
		university.add(ComputerCollege);
		university.add(infoCollege);
		
		//为计算机学院添加系（专业）
		OrganizationComponent department1 = new Department("软件工程", "软件工程很高端");
		OrganizationComponent department2= new Department("计算机科学与技术", "计算机科学与技术很好");
		OrganizationComponent department3= new Department("计算机工程", "计算机工程");
		
		ComputerCollege.add(department1);
		ComputerCollege.add(department2);
		ComputerCollege.add(department3);
		
		//为信息学院添加系
		
		OrganizationComponent department4 = new Department("通信工程", "通信工程");
		OrganizationComponent department5 = new Department("信息工程", "信息工程");
		OrganizationComponent department6 = new Department("信息安全", "信息安全");
		
		infoCollege.add(department4);
		infoCollege.add(department5);
		infoCollege.add(department6);
		
		//调用print方法打印（注意：调用哪个层次就会显示层次中所有包含的内容）
		
		university.print();
	}
	
}
