package com.arbonkeep.bridge;

public class XiaoMi implements Brand{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("小米手机关机了");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("小米手机开机了");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("小米手机打电话");
	}

}
