package com.arbonkeep.memento.theory;
//备忘录对象
public class Memento {
	private String state;
	
	//构造器
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
	
}
