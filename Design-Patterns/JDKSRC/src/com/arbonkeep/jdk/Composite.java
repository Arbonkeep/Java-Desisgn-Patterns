package com.arbonkeep.jdk;

import java.util.HashMap;
import java.util.Map;

//˵��
//1. Map����һ������Ĺ���������Component��
//2. HashMap��һ���м乹��(Composite)��ʵ������ط�����put��putAll
//3. Node��HashMap�ľ�̬�ڲ��࣬����leafҶ�ӽ�㣬��������û��put��putAll������

public class Composite {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "˧��");//ֱ�Ӵ��Ҷ�ӽ��
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
	
		map.put(1, "��Ů");
		map.put(2, "superman ");
		
		hashMap.putAll(map);
		System.out.println(hashMap);
	}
}
