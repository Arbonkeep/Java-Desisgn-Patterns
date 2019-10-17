package com.arbonkeep.prototype.improve;

import com.arbonkeep.prototype.improve.Sheep;;

public class Client {
	public static void main(String[] args) {
		System.out.println("使用原型模式完成对象的克隆");
		Sheep sheep = new Sheep("tom", 1, "white", "蒙古羊");
		
		sheep.friend = new Sheep("tom", 1, "white", "蒙古羊");
		
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();
		Sheep sheep6 = (Sheep) sheep.clone();
		
		System.out.println(sheep2 + "sheep2.friend" + sheep2.friend.hashCode() );
		System.out.println(sheep3 + "sheep3.friend" + sheep3.friend.hashCode() );
		System.out.println(sheep4 + "sheep4.friend" + sheep4.friend.hashCode() );
		System.out.println(sheep5 + "sheep5.friend" + sheep5.friend.hashCode() );
		System.out.println(sheep6 + "sheep6.friend" + sheep6.friend.hashCode() );
		
		//通过比较sheep2,3,4,5,6的friend发现它们的hashCode是一致的，也就是说拷贝只是将引用指向了sheep.friend
		//这就是我们所说的前拷贝，只将该成员变量(sheep.friend)的引用值(内存地址)复制一份给新的对象(sheep2,3,4,5,6
		//的friend)
	}
}
