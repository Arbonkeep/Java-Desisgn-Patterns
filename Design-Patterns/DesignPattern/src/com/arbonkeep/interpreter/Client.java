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
		System.out.println("������Ϊ��" + expStr + "=" + calculator.run(var));
	}
	
	//��ȡ���ʽ
	public static String getExpStr() throws IOException {
		System.out.println("��������ʽ:");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	//��ȡӳ��ֵ
	public static HashMap<String,Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (char c : expStr.toCharArray()) {
			if(c != '+' && c!= '-') {
				if(!map.containsKey(String.valueOf(c))) {
					System.out.print("������" + String.valueOf(c) + "��ֵ��");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(c), Integer.valueOf(in));
				}
			}
		}
		return map;
	}
}
