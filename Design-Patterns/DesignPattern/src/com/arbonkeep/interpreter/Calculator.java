package com.arbonkeep.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	//定义表达式
	private Expression expression;
	
	//声明构造方法，用于传参并解析
	public Calculator(String expStr) {//expStr=a+b
		//进行运算使用Stack这种数据结构完成
		Stack<Expression> stack = new Stack<Expression>();
		
		//将字符串拆分成字符数组
		char[] charArray = expStr.toCharArray();
		
		Expression left = null;
		Expression right = null;
		
		//遍历字符数组
		for(int i = 0; i < charArray.length; i++) {
			//针对不同的情况，进行不同处理
			switch(charArray[i]) {
			case '+':
				left = stack.pop();//将栈顶元素出栈,相当于取出左边元素
				right = new VarExpression(String.valueOf(charArray[++i]));
				//取出右边的表达式（这里再次++就是跳过了中间的+）
				
				stack.push(new AddExpression(left, right));//根据left与right构建一个AddExpression加入栈中
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));//与加法类似
				stack.push(new SubExpression(left, right));
				break;
			default:
				//如果是一个var，就创建一个VarExpression对象，并推到栈顶
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		
		//完成遍历后，stack就得到了最后的Expression
		this.expression = stack.pop();
	}
	
	public int run(HashMap<String, Integer> var) {
		//将表达式a+b和var= {a=10，b=20}绑定，然后传递给expression的Inerpreter进行解释执行
		return this.expression.interpreter(var);
	}
}
