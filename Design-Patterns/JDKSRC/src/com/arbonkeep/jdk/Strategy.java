package com.arbonkeep.jdk;

import java.util.Arrays;
import java.util.Comparator;

public class Strategy {
	public static void main(String[] args) {
		
		//方式1
		//数组
		Integer[] arr = {9, 1, 2, 8, 4, 3};
		
		//实现升序，返回-1放在左边，返回1放在右边，0保持不变
		//说明
		//1.实现了Comaprator接口(策略接口)，匿名类对象new Comparator<Integer>() {...};
		//2.对象new Comparator<Integer>() {...}实现了策略接口对象
		//3.public int compare(Integer o1, Integer o2){...}是具体的处理方式
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		//分析
		/**
			public static <T> void sort(T[] a, Comparator<? super T> c) {
		        if (c == null) {
		            sort(a);//默认方法
		        } else {
		            if (LegacyMergeSort.userRequested)
		                legacyMergeSort(a, c);//使用策略对象C
		            else
		                TimSort.sort(a, 0, a.length, c, null, 0, 0);
		        }
		    }
		 */
		
		Arrays.sort(arr,comparator);
		System.out.println(Arrays.toString(arr));
		
		//方式二 Lambda表达式
		Integer[] arr2 = {19, 11, 12, 18, 14, 13};
		
		Arrays.sort(arr2, (var1, var2) -> {//降序
			if(var1.compareTo(var2) > 0) {
				return -1;
			}else {
				return 1;
			}
		});
		
		System.out.println(Arrays.toString(arr2));
	}
}
