package com.arbonkeep.prototype.improve;

import com.arbonkeep.prototype.improve.Sheep;;

public class Client {
	public static void main(String[] args) {
		System.out.println("ʹ��ԭ��ģʽ��ɶ���Ŀ�¡");
		Sheep sheep = new Sheep("tom", 1, "white", "�ɹ���");
		
		sheep.friend = new Sheep("tom", 1, "white", "�ɹ���");
		
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
		
		//ͨ���Ƚ�sheep2,3,4,5,6��friend�������ǵ�hashCode��һ�µģ�Ҳ����˵����ֻ�ǽ�����ָ����sheep.friend
		//�����������˵��ǰ������ֻ���ó�Ա����(sheep.friend)������ֵ(�ڴ��ַ)����һ�ݸ��µĶ���(sheep2,3,4,5,6
		//��friend)
	}
}
