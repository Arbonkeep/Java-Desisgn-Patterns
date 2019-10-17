package com.arbonkeep.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		// 
		Object bean = applicationContext.getBean("id01");
		System.out.println("bean" + bean);  
		
		Object bean2 = applicationContext.getBean("id01");
		
		System.out.println("bean2" + bean2); 

		System.out.println(bean == bean2); // false，两个不是同一个对象
		
		// ConfigurableApplicationContext
	}

}
