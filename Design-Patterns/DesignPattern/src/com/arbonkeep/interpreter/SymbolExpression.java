package com.arbonkeep.interpreter;

import java.util.HashMap;
//����������Ž�����
//ÿ��������Ŷ�ֻ���Լ��������������й�ϵ������������������Ҳ������һ�������Ľ����
//�������������Ͷ���Expression������
public class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	public SymbolExpression(Expression left , Expression right) {
		this.left = left;
		this.right = right;
	}
	
	//��ΪSymbolExpression������ʵ�֣�����������ֻ��Ҫ��ʵ�ּ���
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
