package com.arbonkeep.observer.improve;

public interface Subject {
	public void registerObserver(Observer o);
	
	public void remove(Observer o);
	
	public void notifyObserver();
}
