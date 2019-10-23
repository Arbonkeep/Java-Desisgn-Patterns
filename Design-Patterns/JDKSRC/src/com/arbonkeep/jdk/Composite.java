package com.arbonkeep.jdk;

import java.util.HashMap;
import java.util.Map;

//说明
//1. Map就是一个抽象的构建（类似Component）
//2. HashMap是一个中间构建(Composite)，实现了相关方法如put，putAll
//3. Node是HashMap的静态内部类，类似leaf叶子结点，这里面是没有put与putAll方法的

public class Composite {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "帅哥");//直接存放叶子结点
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
	
		map.put(1, "美女");
		map.put(2, "superman ");
		
		hashMap.putAll(map);
		System.out.println(hashMap);
	}
}
