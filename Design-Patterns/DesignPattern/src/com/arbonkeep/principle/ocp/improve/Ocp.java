package com.arbonkeep.principle.ocp.improve;
/**
  	实现开闭原则的程序（方式2）
 		分析：方式2的代码不但精简很多，而且符合了开闭原则
 			
 */
public class Ocp {
	public static void main(String[] args) {
		//测试一下
		GraphicEditor g = new GraphicEditor();
		g.drawShape(new Rectangle());
		g.drawShape(new Circle());
		g.drawShape(new Trangle());
		g.drawShape(new Other());
	}
}
//使用方
class GraphicEditor {
	//接收Shape对象，然后根据type。来绘制不同的图形
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
		System.out.println("绘制矩形");	
	}
	
	
}

class Circle extends Shape {
	
	
	@Override
	public void draw() {
		System.out.println("绘制圆形");	
	}
}

class Trangle extends Shape {
	
	
	@Override
	public void draw() {
		System.out.println("绘制三角形");	
	}
}

class Other extends Shape{
	
	@Override
	public void draw() {
		System.out.println("绘制其他图形");
		
	}
	
	
}

