package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("id = "+c1.getId() + "   total = "+ Circle.getTotal());
		Circle c2  = new Circle();
		System.out.println("id = "+c2.getId() + "   total = "+ Circle.getTotal());
		Circle c3  = new Circle(2);
		System.out.println("id = "+c3.getId() + "   total = "+ Circle.getTotal());
		
		
	}

}
