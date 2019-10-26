package com.arbonkeep.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static <E> void main(String[] args) {
		//1. 创建学院，并将学院添加到集合中
		List<College> college = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		
		InfoCollege infoCollege = new InfoCollege();
		
		college.add(computerCollege);
		college.add(infoCollege);
		
		//2. 创建OutputImpl
		OutputImpl outputImpl = new OutputImpl(college);
		
		//3. 调用方法
		outputImpl.printCollege();
		
		
		
		
		
	}
}
