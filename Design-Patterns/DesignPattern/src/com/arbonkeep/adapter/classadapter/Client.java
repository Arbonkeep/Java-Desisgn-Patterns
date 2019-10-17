package com.arbonkeep.adapter.classadapter;

public class Client {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.Charging(new VoltageAdapter());
	}
}
