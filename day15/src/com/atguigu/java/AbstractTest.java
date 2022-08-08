package com.atguigu.java;

public class AbstractTest {
	

}



abstract class Person{
	
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
    public abstract void eat();
    
    public void walk(){
    	System.out.println("走路");
    }
}


class Student extends Person{
	
	
	public void eat(){
		System.out.println("我要吃好的");
	}
	
}
