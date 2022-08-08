package com.atguigu.java;

public class Person extends Creature {
	
	String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	private  void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		eat();
		System.out.println("睡觉");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 
	

}
