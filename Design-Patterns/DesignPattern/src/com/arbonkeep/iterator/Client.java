package com.arbonkeep.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static <E> void main(String[] args) {
		//1. ����ѧԺ������ѧԺ��ӵ�������
		List<College> college = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		
		InfoCollege infoCollege = new InfoCollege();
		
		college.add(computerCollege);
		college.add(infoCollege);
		
		//2. ����OutputImpl
		OutputImpl outputImpl = new OutputImpl(college);
		
		//3. ���÷���
		outputImpl.printCollege();
		
		
		
		
		
	}
}
