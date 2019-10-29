package com.arbonkeep.memento.game;

public class Client {
	public static void main(String[] args) {
		//1.创建游戏角色对象
		GameRole gameRole = new GameRole();
		//初始状态的攻击力与防御力都是100
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("初始状态");
		gameRole.display();
		
		
		//2.创建守护者对象
		Caretaker caretaker = new Caretaker();
		
		//3.调用角色对象的方法创建一个备忘录对象，并调用守护者对象的setMemento方法设置备忘录对象
		caretaker.setMemento(gameRole.createMemento());
		
		//4.经过战斗后游戏角色的状态 
		System.out.println("经过战斗后游戏角色的状态 ");
		gameRole.setVit(30);
		gameRole.setDef(30);
		gameRole.display();
		
		//5.恢复到初始状态
		System.out.println("恢复到初始状态");
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
		gameRole.display();
		
		
	}
}
