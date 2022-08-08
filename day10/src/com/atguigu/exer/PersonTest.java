package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setAge(12);
		System.out.println("年龄为："+p.getAge());
		
		Person p2 = new Person("Tom", 21);
		System.out.println("name = "+ p2.getname()+",age = "+p2.getAge());
	}

}
