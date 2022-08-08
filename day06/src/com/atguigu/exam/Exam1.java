package com.atguigu.exam;

public class Exam1 {
	public static void main(String[] args) {
//		3.	如何遍历如下的二维数组
		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		for(int i =0;i<arr.length;i++)
		{
			for(int k =0;k<arr[i].length;k++)
			{
				System.out.println(arr[i][k]);
			}
		}

	}

}
