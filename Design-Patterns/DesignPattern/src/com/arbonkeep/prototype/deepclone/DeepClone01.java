package com.arbonkeep.prototype.deepclone;

import java.io.Serializable;

public class DeepClone01 implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	
	private String cloneName;
	
	private String cloneClass;
	
	//构造方法
	public DeepClone01(String cloneName, String cloneClass) {
		this.cloneClass = cloneClass;
		
		this.cloneName = cloneName;
	}
	
	//由于该类的属性都是String ，所以直接使用默认的clone即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
