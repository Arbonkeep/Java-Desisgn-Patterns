package com.arbonkeep.interpreter;

import java.util.HashMap;
//变量的解释器
public class VarExpression extends Expression{
	private String key;//key = a,key = b...
	
	public VarExpression(String key) {
		this.key = key;
	}
	
	//var就是{a=10,b=20}
	//interpreter根据变量名称返回对应值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		
		return var.get(this.key);
	}
	
}
