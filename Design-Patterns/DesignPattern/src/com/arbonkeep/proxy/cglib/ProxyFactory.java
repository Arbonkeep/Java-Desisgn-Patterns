package com.arbonkeep.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{
	private Object target;

	//构造方法，将target对象传入
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//返回一个代理对象：target对象的代理对象
	public Object getProxyInstance() {
		//1.创建一个工具类
		Enhancer enhancer = new Enhancer();
		//2.设置父类(为目标函数)
		enhancer.setSuperclass(target.getClass());
		//3.设置回调函数
		enhancer.setCallback(this);
		//4.创建子类对象，即代理对象
		return enhancer.create();
	}
	
	//重写intercept方法，会调用目标对象的方法
	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("Cglib代理模式 。。。开始");
		Object obj = method.invoke(target, args);//可能有返回值
		System.out.println("Cglib代理模式。。。提交");
		
		return obj;
	}
	
}
