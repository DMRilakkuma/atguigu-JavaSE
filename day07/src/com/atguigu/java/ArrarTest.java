package com.atguigu.java;

public class ArrarTest {
	public static void main(String[] args) {
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
//		for(int i =0;i<arr.length/2;i++)
//		{
//			String temp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i]=temp;
//			
//			
//		}
//		for(int i =0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		String dest = "BB";
//		boolean isflag = true;
//		for(int i =0;i<arr.length;i++)
//		{
//			if(dest.equals(arr[i]))
//			{
//				System.out.println("找到指定元素，位置为第:"+i);
//				isflag = false;
//			}
//		}
//		if(isflag)
//		{
//			System.out.println("很遗憾，没有找到");
//		}
		
		//二分法查找
		int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int dest2 = -34;
		int head = 0;
		int end = arr2.length-1;
		boolean isflag2 = true ;
		
		while (head<=end)
		{
			int middle = (head+end)/2;
			if(dest2 == arr2[middle])
			{
				System.out.println("该数位置为:"+middle);
				isflag2 = false;
				break;
			}
			
			else if(dest2 > arr2[middle])
			{
				head = middle+1;
			}
			else 
			{
				end = middle - 1;
			}
		}
		if(isflag2)
		{
			System.out.println("没有找到");
		}
		
		
		
	}

}
