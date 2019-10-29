package com.arbonkeep.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		HashMap<String, Integer> var = getValue(expStr);
		Calculator calculator = new Calculator(expStr);
		System.out.println("运算结果为：" + expStr + "=" + calculator.run(var));
	}
	
	//获取表达式
	public static String getExpStr() throws IOException {
		System.out.println("请输入表达式:");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	//获取映射值
	public static HashMap<String,Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (char c : expStr.toCharArray()) {
			if(c != '+' && c!= '-') {
				if(!map.containsKey(String.valueOf(c))) {
					System.out.print("请输入" + String.valueOf(c) + "的值：");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(c), Integer.valueOf(in));
				}
			}
		}
		return map;
	}
}
