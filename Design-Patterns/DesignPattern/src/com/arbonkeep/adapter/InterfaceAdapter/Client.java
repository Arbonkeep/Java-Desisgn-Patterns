package com.arbonkeep.adapter.InterfaceAdapter;

public class Client {
	public static void main(String[] args) {
		AbstractAdapter abstractAdapter = new AbstractAdapter() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("ʹ��m1����");
			}
		};
		
		abstractAdapter.m1();
	}
}
