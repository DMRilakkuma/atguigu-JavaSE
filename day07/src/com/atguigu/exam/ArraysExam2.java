package com.atguigu.exam;

import java.util.Arrays;

public class ArraysExam2 {
	public static void main(String[] args) {
		int []arr = new int[]{34,5,22,-98,6,-76,0,-3};
		for(int i =0;i<(arr.length-1)/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
