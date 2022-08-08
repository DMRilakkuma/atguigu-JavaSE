package com.atguigu.java;

import org.junit.Test;

public class FinallyTest {
	@Test
	public void test1(){
		try {
			int a = 10;
			int b = 0;

			int result = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("我是你爹");
		}

	}


	@Test
	public void method(){
	
		int num = test2();
		System.out.println(num);
		
	}
	public int test2() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;

		} 
		finally{
			System.out.println("我一定能能执行");
		}

	}

}
