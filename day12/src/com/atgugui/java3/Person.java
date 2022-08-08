package com.atgugui.java3;

public class Person {
	
	String name;
	int id =1000;
	public Person() {
		
	}
	public Person(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void walk(){
		System.out.println("走路");
	}
	

}
