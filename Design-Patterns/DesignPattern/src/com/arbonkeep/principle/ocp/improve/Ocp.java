package com.arbonkeep.principle.ocp.improve;
/**
  	ʵ�ֿ���ԭ��ĳ��򣨷�ʽ2��
 		��������ʽ2�Ĵ��벻������ܶ࣬���ҷ����˿���ԭ��
 			
 */
public class Ocp {
	public static void main(String[] args) {
		//����һ��
		GraphicEditor g = new GraphicEditor();
		g.drawShape(new Rectangle());
		g.drawShape(new Circle());
		g.drawShape(new Trangle());
		g.drawShape(new Other());
	}
}
//ʹ�÷�
class GraphicEditor {
	//����Shape����Ȼ�����type�������Ʋ�ͬ��ͼ��
	public void drawShape(Shape s) {
		s.draw();
	}

}

abstract class Shape {
	
	public abstract void draw();
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("���ƾ���");	
	}
	
	
}

class Circle extends Shape {
	
	
	@Override
	public void draw() {
		System.out.println("����Բ��");	
	}
}

class Trangle extends Shape {
	
	
	@Override
	public void draw() {
		System.out.println("����������");	
	}
}

class Other extends Shape{
	
	@Override
	public void draw() {
		System.out.println("��������ͼ��");
		
	}
	
	
}

