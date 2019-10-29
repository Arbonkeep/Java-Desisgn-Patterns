package com.arbonkeep.memento.theory;

public class Client {
	public static void main(String[] args) {
		//创建原始对象
		Originator originator = new Originator();
		//创建守护者对象（存储了多个原始对象）
		Caretaker caretaker = new Caretaker();
		
		//设置原始对象的状态
		originator.setState("状态一:攻击力1000");
		//将该对象状态保存添加到集合中（第一次保存）
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态二:攻击力800");
		//将该对象状态保存添加到集合中（第二次保存）
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态三:攻击力500");
		//将该对象状态保存添加到集合中（第三次保存）
		caretaker.add(originator.saveStateMemento());
		
		//当前状态
		System.out.println("当前状态是：" + originator.getState());
		
		//恢复到第一次保存的状态
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("当前状态是：" + originator.getState());
			
	}
}
