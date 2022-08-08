package com.atguigu.exer;

public class Circle {
	
	private double radius;
	private int id;
	
	
	private static int inll = 1001;
	private static int total;
	
	public Circle(){
		id = inll++;
		total++;
	}
	
	public Circle(double radius){
		this.radius = radius;
		id = inll++;
		total++;
		
		
	}
	
	
	public double findArea(){
		return Math.PI * radius * radius;
	}

	protected double getRadius() {
		return radius;
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected static int getTotal() {
		return total;
	}
	
	

}
