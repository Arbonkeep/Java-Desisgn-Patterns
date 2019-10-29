package com.arbonkeep.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression{

	public AddExpression(Expression left, Expression right) {
		super(left, right);
		
	}
	
	//处理加法
	//var仍然是{a=10，b=20}
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// super.left.interpreter(var):返回left表达式对应的值a=10
		// super.right.interpreter(var):返回right表达式对应的值a=20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
