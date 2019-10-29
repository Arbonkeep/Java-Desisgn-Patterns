package com.arbonkeep.interpreter;

import java.util.HashMap;
//�����Ľ�����
public class VarExpression extends Expression{
	private String key;//key = a,key = b...
	
	public VarExpression(String key) {
		this.key = key;
	}
	
	//var����{a=10,b=20}
	//interpreter���ݱ������Ʒ��ض�Ӧֵ
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		
		return var.get(this.key);
	}
	
}
