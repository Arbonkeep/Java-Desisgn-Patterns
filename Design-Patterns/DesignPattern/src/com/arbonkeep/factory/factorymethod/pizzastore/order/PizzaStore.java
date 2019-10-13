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
			System.out.println("请输入订购披萨的地区：");
			String str = br.readLine();
			return str;
		} catch(Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
}
