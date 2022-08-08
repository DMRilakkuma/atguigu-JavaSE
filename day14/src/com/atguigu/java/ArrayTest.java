package com.atguigu.java;

import org.junit.Test;

public class ArrayTest {
	@Test
	public void test()
	{
		int []arr = new int []{1,2,3};
		test2(arr);
		
	}
	
	public void test2(Object obj)
	{
		System.out.println(obj.getClass().getSuperclass());
		
	}

}
