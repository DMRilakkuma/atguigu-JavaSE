package com.atguigu.java2;

public class NetworkTest {
	public static void main(String[] args) {
		Person p = new Person(new Man());
		p.walk();

	}

}

interface Network {
	public void walk();
}

class Man implements Network {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("开飞机");

	}

}

class Person implements Network{
	private Network work;
	public Person(Network work){
		this.work =work;
	}

	@Override
	public void walk()  {
		// TODO Auto-generated method stub
		System.out.println("跑步");
		
		work.walk();
		
	}
	

}
