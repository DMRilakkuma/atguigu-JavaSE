package com.atguigu.exam;

public class ArraysExam4 {
	public static void main(String[] args) {
		int []arr = new int[]{34,5,22,-98,6,-76,0,-3};
		boolean isflag = true;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == 22)
			{
				System.out.println("22在第"+i+"个位置");
				isflag = false;
				break;
				
			}
		}
		if(isflag)
		{
			System.out.println("不存在");
		}
				
	}

}
