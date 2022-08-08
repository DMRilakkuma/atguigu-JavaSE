package com.atgugui.java3;

public class Student extends Person {
	
	int id = 1002;

	public Student() {
		
	}

	public Student(int id) {
		
		this.id = id;
	}
	
	
	
	public void eat(){
		System.out.println("学生要吃好吃的");
		
	}
	
	public void test(){
		eat();
		super.eat();
		System.out.println(super.id);
	}

}
