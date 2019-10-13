package com.arbonkeep.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PizzaStore {
	public static void main(String[] args) {
		String loc = getAddress();
			
		if(loc.equals("bj")) {
			new BJOrderPizza();
		}else if(loc.equals("ld")){
			new LDOrderPizza();
		}
		
	}
	
	public static String getAddress() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�����붩�������ĵ�����");
			String str = br.readLine();
			return str;
		} catch(Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
}
