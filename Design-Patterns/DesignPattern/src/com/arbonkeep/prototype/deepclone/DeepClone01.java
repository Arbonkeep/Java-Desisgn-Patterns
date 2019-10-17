package com.arbonkeep.prototype.deepclone;

import java.io.Serializable;

public class DeepClone01 implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	
	private String cloneName;
	
	private String cloneClass;
	
	//���췽��
	public DeepClone01(String cloneName, String cloneClass) {
		this.cloneClass = cloneClass;
		
		this.cloneName = cloneName;
	}
	
	//���ڸ�������Զ���String ������ֱ��ʹ��Ĭ�ϵ�clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
