package com.atguigu.java1;

public class ValueTransferTest {
	public static void main(String[] args) {
		int m =10;
		int n =m;
		System.out.println("m = "+m+", n ="+n );
		
	
		
		ValueTransferTest test = new ValueTransferTest();
		test.swap(m, n);
		System.out.println("m=:"+m+", n=:"+n);
	}
	
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp ;
	}

}
