package com.atgugui.java2;

import org.junit.Test;

public class WrapperTest {
	
	
	@Test
	public void Test4(){
		int num = 10;
		Integer in1 = num;
		String str = String.valueOf(num);
				System.out.println(str);
				
				int int1 = Integer.parseInt(str);
				System.out.println(int1);
		float f1 = 32.1f;
		Float f = f1;
			String str2 = String.valueOf(f);
			System.out.println(str2);
				
	}
	@Test
	public void test3(){
		int num1 = 10;
		Integer in3 = num1;
	    method(in3);
	    int i = in3;
	    System.out.println(i);
	    float f =  3.0f;
	    Float f3 = f;
	    System.out.println(f3);
	    boolean b = true;
	    Boolean b4 = b;
	    System.out.println(b4);
	    boolean bl = b4;
	    System.out.println(bl);
	    
		
	}
	
	public void method(Object obj){
		System.out.println(obj.toString());
	}

	@Test
	public void test1() {
		int num = 10;
		Integer in1 = new Integer(num);
		System.out.println(in1.toString());
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());

		Float f1 = new Float("123.0");
		Float f2 = new Float(123);
		System.out.println(f1);
		System.out.println(f2);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true123");
		System.out.println(b1);
		System.out.println(b2);
		Order order = new Order();
		System.out.println(order.isMale);
		System.out.println(order.isFemale);
	}

}


class Order{
	
		boolean isMale;
		Boolean isFemale;
	
}
