package com.atguigu.exer;

public class ValueExer1 {
	public static void main(String[] args) {
		PassObject p = new PassObject();
		Circle c = new Circle();
		
		p.printAreas(c, 5);
	}

}

class Circle{
	double radius;
	public double findArea(){
		
		return Math.PI* radius*radius;
		
	}
	
	
}

class PassObject{
	
	public void printAreas(Circle c, int time){
		for(int i =1;i <= time; i++)
		{
			c.radius = i;
			double area = c.findArea();
			System.out.println("半径为："+i+",面积为："+area);
			
		}
	}
}


