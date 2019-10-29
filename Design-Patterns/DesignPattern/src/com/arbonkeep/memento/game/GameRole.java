package com.arbonkeep.memento.game;
//游戏角色类
public class GameRole {
	private int vit;
	private int def;
	
	//提供对应的get/set方法获取属性
	public int getVit() {
		return vit;
	}

	public int getDef() {
		return def;
	}
	
	public void setVit(int vit) {
		this.vit = vit;
	}

	public void setDef(int def) {
		this.def = def;
	}

	//创建一个Memento的方法,根据当前属性 获取一个Memento对象
	public Memento createMemento() {
		return new Memento(vit, def);
	}
	
	//使用备忘录对象恢复之前的状态的方法
	public void recoverGameRoleFromMemento(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}
	
	//用于打印出内容的方法
	public void display() {
		System.out.println("游戏角色的当前攻击力为" + this.vit + "当前防御力为" + this.def);
	}
	
}
