package com.arbonkeep.facade;
//�����
public class HomeThreatorFacade {
	//������Ա����
	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	private Stereo stereo;
	private TheaterLights theaterLights;
	
	//����
	public HomeThreatorFacade() {
		super();
		this.dvdPlayer = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.stereo = Stereo.getInstance();
		this.theaterLights = TheaterLights.getInstance();
	}
	
	//��Ϊ4��
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theaterLights.dim();
	}
	
	public void play() {
		dvdPlayer.play();
	}
	
	public void pause() {
		dvdPlayer.pause();
	}
	
	public void end() {
		popcorn.off();
		theaterLights.bright();
		screen.up();
		projector.off();
		stereo.off();
		dvdPlayer.end();
	}
	
	
}
