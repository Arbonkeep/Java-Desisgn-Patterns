package com.arbonkeep.principle.ocp;
/**
  	ʵ�ֿ���ԭ��ĳ��򣨷�ʽ1��
 		������1. �ŵ㣺����⣬������
 			2. ȱ�㣺Υ����ocpԭ�򣬶���չ���ţ��ṩ���������޸Ĺرգ�ʹ�÷�����������������¹���ʱ��
 				     ���Ǿ������޸Ĵ��룬�����޸Ĵ���
 				     
 			3. ���������Ҫ���һ�����ܣ�����Ҫ�ദ�޸�
 			
 		�Ľ���
 			�Ѵ���Shape��ĳɳ����࣬���ṩһ������ķ�����������ȥʵ�ּ��ɣ������������µ�ͼ������ʱ��
 			ֻ��Ҫ���µ�ͼ����̳�Shape����ʵ��draw�������ɣ�ʹ�÷��Ĵ��벻��Ҫ�޸ģ������˿���ԭ��
 			
 		
 	
 			
 */
public class Ocp {
	public static void main(String[] args) {
		//����һ��
		GraphicEditor g = new GraphicEditor();
		g.drawRectangle(new Rectangle());
		g.drawCircle(new Circle());
		g.drawTrangle(new Trangle());
	}
}
//ʹ�÷�
class GraphicEditor {
	//����Shape����Ȼ�����type�������Ʋ�ͬ��ͼ��
	public void drawShape(Shape s) {
		if(s.m_type == 1) {
			drawRectangle(s);
		}else if(s.m_type == 2) {
			drawCircle(s);
		}else if(s.m_type == 3){
			drawTrangle(s);
		}
	}
	
	public void drawRectangle(Shape s) {
		System.out.println("���ƾ���");
	}
	
	public void drawCircle(Shape s) {
		System.out.println("����Բ��");
	}
	
	public void drawTrangle(Shape s) {
		System.out.println("����������");
	}
}

class Shape {
	int m_type;
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
}

class Trangle extends Shape {
	Trangle() {
		super.m_type = 3;
	}
}

