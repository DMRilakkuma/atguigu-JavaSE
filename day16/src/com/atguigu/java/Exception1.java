package com.atguigu.java;

import org.junit.Test;

public class Exception1 {
	@Test
	public void test1(){
		
		try{
			String arr = "abc";
			int num = Integer.parseInt(arr);
		}
		catch(NullPointerException e){
			System.out.println("空指针异常");
			
		}
		catch(ClassCastException e){
			System.out.println("类型强制转换异常");
			
		}
		catch(NumberFormatException e){
			System.out.println("数值转化异常");
		}
//		catch(Exception e){
//			System.out.println("异常");
//		}
		
		System.out.println("异常处理完成");
		
	}

}
