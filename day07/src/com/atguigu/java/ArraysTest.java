package com.atguigu.java;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ArraysTest {
	public static void main(String[] args) {
		
		int [] arr1 =new int[]{1,2,3,4};
		int []arr2 =new int[]{1,3,2,4};
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		
		System.out.println(Arrays.toString(arr1));
	}

}
