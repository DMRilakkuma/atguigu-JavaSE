package com.atgugui.exer3;

public class GeometricTest {
	
	public static void main(String[] args) {
		
		GeometricTest test = new GeometricTest();
		boolean isFlag = test.equalsArea(new Circle(2.1,"黄",1), new MyRectangle(2.1,0, "绿",3));
		System.out.println(isFlag);
		test.displayGeometricObkect(new Circle(2.1,"黄",1));
		
	  
	    
		
	}
	
	
	public boolean equalsArea(GeometricObject o1,GeometricObject o2){
		return o1.findArea() == o2.findArea();
	}
	
	public void displayGeometricObkect(GeometricObject o){
		System.out.println(o.findArea());
		
	}

}



