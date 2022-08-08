package com.atgugui.exer2;

public class Cylinder  extends Circle{
	 private double length;

	public Cylinder() {
		length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume(){
		return Math.PI*getRadius() * getRadius() * getLength();
	}
	 
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return Math.PI * getRadius() * getRadius() *2 + 2 * Math.PI * getLength();
	}
	 

}
