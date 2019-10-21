package com.arbonkeep.decorator;

public class Client {
	public static void main(String[] args) {
		//装饰者模式下订单：2份巧克力加一份牛奶的LongBlack
		
		//1.点一份LongBlack(点一份单品咖啡)
		Drink order = new LongBlack();
		System.out.println("一份美式咖啡的费用=" + order.cost() );
		System.out.println("一份美式咖啡的描述=" + order.getDesc() );
		
		//2.加一份牛奶
		order = new Milk(order);
		
		System.out.println("order + 一份牛奶的费用=" + order.cost() );
		System.out.println("order + 一份牛奶的描述=" + order.getDesc() );
		
		//3.加一份巧克力
		order = new Chocolate(order);
		
		System.out.println("order + 一份牛奶 + 一份巧克力的费用=" + order.cost() );
		System.out.println("order + 一份牛奶 + 一份巧克力的描述=" + order.getDesc() );
		
		//4.再加一份巧克力
		order = new Chocolate(order);
		
		System.out.println("order + 一份牛奶 + 2份巧克力的费用=" + order.cost() );
		System.out.println("order + 一份牛奶 + 2份巧克力的描述=" + order.getDesc() );
		
		
	}
}
