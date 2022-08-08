package com.atguigu.java;
/*
 * 面对对象的特征之一：封装与隐藏
 * 
 */

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a  = new Animal();
		a.name = "大黄";
		a.age = 1;
//		a.legs = 4;
		
		a.show();
		
//		a.legs = -4 ;
		a.setLegs(6);
		a.show();
		
		
	}

}


class Animal{
	
	String name ;
	int age ;
	private int legs ;
	
	public void setLegs(int l){
		if(l >= 0 && l % 2 ==0 ){
			legs = l;
		}
		else{
			legs = 0;
		}
	}
	//对属性的获取
	public int getLegs(){
		return legs;
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name ="+name+",age = "+age+",legs = "+legs);
	}
}
