package com.arbonkeep.interpreter;

import java.util.HashMap;
/**
 * ������ʽ��ͨ��HashMap��ֵ�ԣ����Ի�ȡ��������ֵ
 * @author asus
 *
 */
public abstract class Expression {
	//�������󷽷�interpreter
	//a+b
	//���͹�ʽ����ֵ��key���ǹ�ʽ(���ʽ)����[a,b,c],value���Ǿ���ֵ
	//HashMap{a=10,b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
	
}
