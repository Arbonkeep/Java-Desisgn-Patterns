package com.arbonkeep.principle.ocp;
/**
  	实现开闭原则的程序（方式1）
 		分析：1. 优点：易理解，操作简单
 			2. 缺点：违反了ocp原则，对扩展开放（提供方），对修改关闭（使用方），即在我们添加新功能时，
 				     我们尽量不修改代码，或少修改代码
 				     
 			3. 如果我们需要添加一个功能，就需要多处修改
 			
 		改进：
 			把创建Shape类改成抽象类，并提供一个抽象的方法，让子类去实现即可，这样我们有新的图形种类时，
 			只需要让新的图形类继承Shape，并实现draw方法即可，使用方的代码不需要修改，满足了开闭原则
 			
 		
 	
 			
 */
public class Ocp {
	public static void main(String[] args) {
		//测试一下
		GraphicEditor g = new GraphicEditor();
		g.drawRectangle(new Rectangle());
		g.drawCircle(new Circle());
		g.drawTrangle(new Trangle());
	}
}
//使用方
class GraphicEditor {
	//接收Shape对象，然后根据type。来绘制不同的图形
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
		System.out.println("绘制矩形");
	}
	
	public void drawCircle(Shape s) {
		System.out.println("绘制圆形");
	}
	
	public void drawTrangle(Shape s) {
		System.out.println("绘制三角形");
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

