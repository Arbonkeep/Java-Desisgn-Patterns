package com.arbonkeep.interpreter;

import java.util.HashMap;
//抽象运算符号解析器
//每个运算符号都只和自己左右两个数字有关系，但是左右两个数字也可能是一个解析的结果，
//无论是哪种类型都是Expression的子类
public class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	public SymbolExpression(Expression left , Expression right) {
		this.left = left;
		this.right = right;
	}
	
	//因为SymbolExpression由子类实现，所以在这里只需要空实现即可
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
