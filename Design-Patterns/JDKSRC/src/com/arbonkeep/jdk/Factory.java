package com.arbonkeep.jdk;

import java.util.Calendar;

//Calendar中就使用了简单工厂模式
public class Factory {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//说明getInstance()是静态方法
		System.out.println("年:" + cal.get(Calendar.YEAR));
		System.out.println("月:" + cal.get((Calendar.MONTH) + 1));
		System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("分:" + cal.get(Calendar.MINUTE));
		System.out.println("秒:" + cal.get(Calendar.SECOND));
	}
}
