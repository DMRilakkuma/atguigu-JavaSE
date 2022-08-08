package com.atguigu.exer;

public class Person {
	
	public String name;
	public int age;
	
	/**
	 * sex为男则为1，女则为为0
	 */
	public int sex;
	
	public void study()
	{
		System.out.println("studying");
	}
	
	public void showAge()
	{
		System.out.println("age:"+age);
	}
	
	public int addAge(int i)
	{
		age+=i;
		return age;
	}


}
