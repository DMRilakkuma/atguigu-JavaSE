package com.atgugui.java2;

import java.util.Date;

import org.junit.Test;

public class JUnitTest {
	int num = 20;
	@Test
	public void testEquals(){
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
//		Object obj = new String("MM");
//		Date date = (Date)obj;
		show();
		System.out.println(num);
		
	}
	


	public void show(){
		System.out.println("吕聪");
	}
	
	@Test
	public void testToString(){
		String str = "MM";
		System.out.println(str.toString());
	}

}
