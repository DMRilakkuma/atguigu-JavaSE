package com.atgugui.java1;

import java.sql.Date;

import javax.xml.crypto.Data;

public class EqualsTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;

		double d = 10.0;

		System.out.println(i == j);
		System.out.println(i == d);

		char c = 65;
		System.out.println(c == i);

		String s = "10";
		// System.out.println(i == s);

		char c2 = 'A';
		System.out.println(c == c2);
        
		
		
		Customer cust1 = new Customer(10,"Tom");
		Customer cust2 = new Customer(10,"Tom");
		
		System.out.println(cust1 == cust2);
		System.out.println(cust1.equals(cust2));
		
//		String str1  = new String("atguigu");
//		String str2 = new String("atguigu");
//		System.out.println(str1 == str2);
//		System.out.println("****************");
//		System.out.println(str1.equals(str2));
//		
//		Date date1 = new Date(32432525324L);
//		Date date2 = new Date(32432525324L);
//		System.out.println(date1.equals(date2));
		
	}

}
