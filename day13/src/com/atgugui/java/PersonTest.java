package com.atgugui.java;

public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.eat();

		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();

		System.out.println("*************************");

		Person p2 = new Man();
		p2.eat();
		
		
		System.out.println(p2.id);
		
		System.out.println("*****************************");
		
		p2.name = "Tom";
//		p2.isSmoling = true;
		
		Man m1 = (Man)   p2;
		m1.isSmoking = true;
		m1. earnMoney();
		
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
		
		
		if( p2 instanceof Man){
			System.out.println("*************Man*************");
		}
		
		
		if( p2 instanceof Person){
			System.out.println("*************Person*************");
		}
		
	    if( p2 instanceof Object){
	    	System.out.println("**************Object*************");
	    }
	    
	    //练习
	    //编译时通过，运行时不通过
	    Person p3 = new Woman();
	    Man m3 = (Man)p3;
        
//	    //编译通过，运行时也通过
//	    Object obj = new Woman();
//	    Person p = (Person)obj;
	    Person p4 = new Person();
	    Man m4 = (Man)p4;
	   
	    
	}

}
