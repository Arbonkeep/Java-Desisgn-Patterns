package com.arbonkeep.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	//������ʽ
	private Expression expression;
	
	//�������췽�������ڴ��β�����
	public Calculator(String expStr) {//expStr=a+b
		//��������ʹ��Stack�������ݽṹ���
		Stack<Expression> stack = new Stack<Expression>();
		
		//���ַ�����ֳ��ַ�����
		char[] charArray = expStr.toCharArray();
		
		Expression left = null;
		Expression right = null;
		
		//�����ַ�����
		for(int i = 0; i < charArray.length; i++) {
			//��Բ�ͬ����������в�ͬ����
			switch(charArray[i]) {
			case '+':
				left = stack.pop();//��ջ��Ԫ�س�ջ,�൱��ȡ�����Ԫ��
				right = new VarExpression(String.valueOf(charArray[++i]));
				//ȡ���ұߵı��ʽ�������ٴ�++�����������м��+��
				
				stack.push(new AddExpression(left, right));//����left��right����һ��AddExpression����ջ��
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));//��ӷ�����
				stack.push(new SubExpression(left, right));
				break;
			default:
				//�����һ��var���ʹ���һ��VarExpression���󣬲��Ƶ�ջ��
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		
		//��ɱ�����stack�͵õ�������Expression
		this.expression = stack.pop();
	}
	
	public int run(HashMap<String, Integer> var) {
		//�����ʽa+b��var= {a=10��b=20}�󶨣�Ȼ�󴫵ݸ�expression��Inerpreter���н���ִ��
		return this.expression.interpreter(var);
	}
}
