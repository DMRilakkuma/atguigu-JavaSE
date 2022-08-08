package com.atgugui.exer4;

public class OrderTest {
	public static void main(String[] args) {
		
		
		Order order1 = new Order(10,"吕聪");
		Order order2 = new Order(10,"吕聪");
		System.out.println(order1.equals(order2));
	}

}
