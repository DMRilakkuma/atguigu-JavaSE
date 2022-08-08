package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		
	
	
	Person p = new Person();
	p.name = "李浩";
	p.age = 15;
	p.sex = 1;
	
	p.study();
	p.showAge();
	int newage = p.addAge(2);
	System.out.println(newage);
	
	
}
	
}
