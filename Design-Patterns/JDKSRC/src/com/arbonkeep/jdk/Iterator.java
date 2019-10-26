package com.arbonkeep.jdk;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("123");
		
		java.util.Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			 String string = iterator.next();
			 System.out.println(string);
		}
	}
}
