package com.arbonkeep.visitor;

public class Woman extends Person {

	@Override
	public void accept(Action action) {
		action.getWomanResult(this);
		
	}

}
