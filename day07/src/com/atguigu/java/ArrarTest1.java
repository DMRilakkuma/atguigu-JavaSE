package com.atguigu.java;

//定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
//然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
//要求：所有随机数都是两位数。
//提示；
//[0,1) * 90 [0,90) + 10  [10,100) [10,99]
//(int)(Math.random() * 90 + 10


public class ArrarTest1 {
	public static void main(String[] args) {
		int []arr =new int [10];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*(99-10+1)+10);
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		int MaxValue = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>MaxValue)
			{
				MaxValue = arr[i];
			}
		}
		System.out.println("最大值为:"+MaxValue);
		
		int MinValue = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<MinValue)
			{
				MinValue = arr[i];
			}
		}
		System.out.println("最小值为:"+MinValue);
		
		int souce = 0;
		for(int i =0;i<arr.length;i++)
		{
			souce+=arr[i];
		}
		System.out.println("总和为："+souce);
		System.out.println("平均值为:"+souce/arr.length);
		
		
	}
	

}
