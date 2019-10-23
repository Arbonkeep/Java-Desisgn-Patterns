package com.arbonkeep.facade;

public class Client {
	public static void main(String[] args) {
		HomeThreatorFacade homeThreatorFacade = new HomeThreatorFacade();
		homeThreatorFacade.ready();
		homeThreatorFacade.play();
		homeThreatorFacade.pause();
		homeThreatorFacade.end();
	}
}
