package com.atguigu.java2;
//this关键字的使用
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
	}

}

class Person{
	
	private String name;
	private int age;
	
	public Person(){
		this.eat();
	}
	
	public Person(String name){
		this();
		this.name = name;
	}
	
	public Person(int age){
		this();
		this.age = age;
	}
	
	public Person(String name, int age){
		this(age);
		this.name = name;
		//this.age = age;
	}
	
	public void setName(String name){
		
	    this.name  = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void eat(){
		System.out.println("人吃饭");
	}
	
	public void study(){
		System.out.println("人学习");
	}
	
}
