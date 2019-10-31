package com.arbonkeep.jdk;

import java.util.Arrays;
import java.util.Comparator;

public class Strategy {
	public static void main(String[] args) {
		
		//��ʽ1
		//����
		Integer[] arr = {9, 1, 2, 8, 4, 3};
		
		//ʵ�����򣬷���-1������ߣ�����1�����ұߣ�0���ֲ���
		//˵��
		//1.ʵ����Comaprator�ӿ�(���Խӿ�)�����������new Comparator<Integer>() {...};
		//2.����new Comparator<Integer>() {...}ʵ���˲��Խӿڶ���
		//3.public int compare(Integer o1, Integer o2){...}�Ǿ���Ĵ���ʽ
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
		//����
		/**
			public static <T> void sort(T[] a, Comparator<? super T> c) {
		        if (c == null) {
		            sort(a);//Ĭ�Ϸ���
		        } else {
		            if (LegacyMergeSort.userRequested)
		                legacyMergeSort(a, c);//ʹ�ò��Զ���C
		            else
		                TimSort.sort(a, 0, a.length, c, null, 0, 0);
		        }
		    }
		 */
		
		Arrays.sort(arr,comparator);
		System.out.println(Arrays.toString(arr));
		
		//��ʽ�� Lambda���ʽ
		Integer[] arr2 = {19, 11, 12, 18, 14, 13};
		
		Arrays.sort(arr2, (var1, var2) -> {//����
			if(var1.compareTo(var2) > 0) {
				return -1;
			}else {
				return 1;
			}
		});
		
		System.out.println(Arrays.toString(arr2));
	}
}
