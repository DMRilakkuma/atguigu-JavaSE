package com.atguigu.java;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
		//将p1变量的对象地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体。
		Person p3 = p1;
		System.out.println(p3.name);
		
		 p3.age = 10;
		 System.out.println(p1.age);
		
		
	}
	

}

class Person{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language){
		System.out.println("人可以说话，使用的是："+language);
	}
}


