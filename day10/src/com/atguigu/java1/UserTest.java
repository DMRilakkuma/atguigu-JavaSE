package com.atguigu.java1;

public class UserTest {
	public static void main(String[] args) {
		User u = new User();
		
		System.out.println(u.age);
		
		User u1 = new User(2);
		u1.setAge(3);
		System.out.println(u1.age);
	}

}


class User{
	
	String name;
	int age = 1;
	
	public User(){
		
	}
	
	
	public User(int a){
		age = a;
	}
	
	public void setAge(int a){
		age =a ;
	}
}
