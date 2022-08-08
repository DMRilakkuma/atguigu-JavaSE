package com.atguigu.exer;

public class YanHuiTest {
	public static void main(String[] args) {
		//初始化
		int [][]yangHui = new int[10][];
		
		//赋值
		for(int i = 0;i<yangHui.length;i++)
		{
			yangHui[i] =new int[i+1]; 
			yangHui[i][0]=yangHui[i][i]=1;
		}
		for(int i =0;i<yangHui.length;i++)
		{
			for(int j=1;j<i;j++)
			{
				yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
			}
		}
		
		for(int i=0;i<yangHui.length;i++)
		{
			for(int j =0;j<yangHui[i].length;j++)
			{
				System.out.print(yangHui[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
