package com.arbonkeep.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	private Object target;
	
	//构造方法，通过构造方法将目标对象传入
	public ProxyFactory(Object target) {
		this.target = target;
	}
	/*
	 public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, 
	 										InvocationHandler h)
	 										
	 	1.ClassLoader loader:指定当前目标对象使用的类加载器，获取类加载器的方法固定
	 	2.Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
	 	3.InvocationHandler h：事件处理，执行目标对象方法时，会触发事件处理方法，会把当前执行的目标对象方法作为参数传入
	 
	 */
	
	
	//获取一个代理对象实例
	public Object getProxyInstance() {
		//通过反射机制获取代理对象，并返回
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//在这个方法中可以实现其他的功能
				System.out.println("JDK代理开始");
				Object obj = method.invoke(target, args);//执行方法
				System.out.println("JDK代理提交");
				return obj;
			}
		});
	}
}
