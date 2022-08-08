package com.atgugui.exer5;

public class Circle extends GeometricObject{
	
	public double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,double weight) {
		super();
		this.radius = radius;
	}


	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.radius == c.radius ){
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	protected double getRadius() {
		return radius;
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
