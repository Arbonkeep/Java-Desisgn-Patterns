package com.arbonkeep.bridge;
/**
 * 这里的Phone相当于桥，桥接了其他类
 * @author asus
 *
 */
public class Client {
	public static void main(String[] args) {
		//小米手机的折叠样式的手机
		Phone p = new FoldedPhone(new XiaoMi());
		//调用方法
		p.call();
		p.close();
		p.open();
		
		System.out.println("-------------------------");
		
		//Vivo手机的折叠样式的手机
		Phone p2 = new UprightPhone(new Vivo());
		
		p2.call();
		p2.close();
		p2.open();
		
	}
}
