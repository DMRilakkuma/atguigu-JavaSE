package com.atguigu.exam;

import java.util.Arrays;

public class ArraysExam3 {
	public static void main(String[] args) {
		int []arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		int []arr2 = new int[arr.length];
		
		for(int i =0;i<arr.length;i++)
		{
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
