package com.arbonkeep.decorator;
//�����װ���ߣ�������ǵ�ζƷ
public class Chocolate extends Decorator {
	public Chocolate(Drink obj) {
		super(obj);
		setDesc("�ɿ���");
		setPrice(3.0f);
	}
}
