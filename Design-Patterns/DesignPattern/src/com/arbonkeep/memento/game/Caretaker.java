package com.arbonkeep.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

//守护者对象
public class Caretaker {
	//只保存一次状态
	private Memento memento;
	//对GameRole保存多次状态
	//private ArrayList<Memento> list;
	//对多个游戏角色保存多次状态
	//private HashMap<String, ArrayList<Memento>> map;
	
	
	//返回一个memento对象
	public Memento getMemento() {
		return memento;
	}
	
	//将memento设置为传入的Memento（这是只保存一次状态的情况）
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
