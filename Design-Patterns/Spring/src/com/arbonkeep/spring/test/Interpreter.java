package com.arbonkeep.spring.test;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Interpreter {
	public static void main(String[] args) {
		
		SpelExpressionParser parser = new SpelExpressionParser();
		
		Expression expression = parser.parseExpression("10 * (2 + 1) * 1 +66");
		
		int result = (int) expression.getValue();
		System.out.println(result);
	}
}
