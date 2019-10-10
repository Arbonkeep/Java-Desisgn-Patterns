package com.arbonkeep.principle.inversion;

import javax.management.openmbean.OpenDataException;

/**
 * 本类实现了依赖的三种方式，并对三种方式进行了测试
 * @author asus
 *
 */
public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangHong changHong = new ChangHong();
		//方式1:通过接口传递参数
//		OpenAndClose o = new OpenAndClose();
//		o.open(changHong);
		
		//方式2:通过构造方法传递参数
//		OpenAndClose o = new OpenAndClose(changHong);
//		o.open();
		
		//方式3:通过setter方法传递参数
		OpenAndClass o = new OpenAndClass();
		o.set(changHong);//首先需要通过setter方法将参数传递进去
		o.open();
		
	}

}

class ChangHong implements ITV {
	public void play() {
		System.out.println("长虹电视机：开始播放");
	}
}

////方式1：通过接口实现依赖
//interface IOpenAndClose {
//	public void open(ITV tv);//将ITV对象通过接口传入
//}
//
//interface ITV {
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	public void open(ITV tv) {
//		tv.play();
//	}
//}

////方式2：通过构造方法实现依赖
//
//interface IOpenAndClose {
//	public void open();
//}
//
//interface ITV {
//	public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//	private ITV tv;
//	
//	public OpenAndClose(ITV tv) {//通过构造方法将对象传入
//		
//		this.tv = tv;
//	}
//	
//	public void open() {
//		this.tv.play();
//	}
//}

//方式3通过setter方法实现依赖

interface IOpenAndeClose {
	public void open();
}

interface ITV {
	public void play();
}

class OpenAndClass implements IOpenAndeClose {
	private ITV tv;
	
	public void set(ITV tv) {
		this.tv = tv;
	}
	
	public void open() {
		tv.play();
	}
}
