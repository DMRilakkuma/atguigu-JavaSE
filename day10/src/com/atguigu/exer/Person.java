package com.atguigu.exer;

public class Person {
	
	private int age;
	private String name;
	
	public Person(){
		age  = 18;
	}
	
	public Person(String n , int a){
		name = n;
		age = a;
	}
	
	public void setAge(int l){
		if(l >=0 && l <= 130){
			age = l;
			
		}
		else{
			throw new RuntimeException("传入的数据非法!");
		}
		
	}
	
	
	public int getAge(){
		return age;
	}
	//绝对不能这样写
	public int doAge(int a){
		age = a;
		return age;
	}
	
	public String getname(){
		return name;
	}
	
	public int getAge1(){
		return age;
	}

}
