package com.atguigu.java1;

public class PersonTest {
	public static void main(String[] args) {
		
	
	Person p = new Person();
	
	p.eat();
	
	Person p1 = new Person("Tom");
	System.out.println(p1.name);
	
   
	
	}
}


class Person{
	//属性
	String name;
	int age;
	
	
	//构造器
	public Person(){
		System.out.println("Person()......");
	}
	
	public Person(String n ){
		name = n ;
	}
	
	
	
	
	
	
	//方法
	public void eat(){
		System.out.println("人吃饭");
	}
	
	public void study(){
		System.out.println("人可以学习");
	}
}
