package com.atguigu.java1;

public class StaticTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "吕聪";
		p1.age = 21;
		p1.county = "CNI";
		Person p2 = new Person();
		p1.name = "王兵";
		p1.age = 21;
		p2.county = "Chinese";
		System.out.println(p1.county);
		
	}

}


class Person{
	
	String name;
	int age ;
	static String county;
	
	
	
	public void eat(){
		System.out.println("我要吃饭");
		walk();
		System.out.println(county);
	}
	
	public static void walk(){
		System.out.println("走路");
		
	}
	
	public void info(){
		System.out.println("name:"+name+",age"+age);
	}
}
