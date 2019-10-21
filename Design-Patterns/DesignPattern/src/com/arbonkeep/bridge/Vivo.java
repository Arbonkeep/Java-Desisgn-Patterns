package com.arbonkeep.bridge;

public class Vivo implements Brand{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机关机了");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机开机了");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机打电话");
	}

}
