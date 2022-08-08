package com.atguigu.java2;

public class RecursionTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		System.out.println(sum1);
		
		int sum2 = test.g(10);
		System.out.println(sum2);
	}
	
	
   //计算1-100之间所有自然数的和
	
	public int getSum(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n + getSum(n-1);
		}
		
	}
	
	   public int f(int n){
		if(n == 0){
			return 1;
		}
		else if(n == 1){
			return 4;
		}
		else{
			return 2*f(n-1) +f(n-2);
		}
	}
		
	public int g(int n){
		if(n == 1||n== 2){
			return 1;
		}
		else{
			return g(n-1)+g(n-2);
		}
	}



	
	

}
