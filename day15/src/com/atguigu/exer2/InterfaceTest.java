package com.atguigu.exer2;
//定义一个接口用来实现两个对象的比较。
//interface CompareObject{
//public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数，代表当
//前对象大；负数代表当前对象小
//}
//定义一个Circle类，声明redius属性，提供getter和setter方法
//定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
//ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
//径大小。
//定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo
//方法比较两个类的半径大小。
//思 考 ： 参 照 上 述 做 法 定 义 矩 形 类 Rectangle 和 ComparableRectangle 类 ， 在
//ComparableRectangle类中给出compareTo方法的实现，比较两个矩形的面积大小。

public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(5);
		ComparableCircle c2 = new ComparableCircle(4);
		System.out.println(c1.compareTo(c2));
		
		
		
	}

}

interface CompareObject{
	public  int compareTo(Object o);
}

class Circle{
	
	public Circle() {
		super();
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	private double radius;

	protected  double getRadius() {
		return radius;
	}

	protected void setRadius(double radius) {
		this.radius = radius;
	}
	
}


class ComparableCircle extends Circle implements CompareObject{
	

	public ComparableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof ComparableCircle){
			ComparableCircle c = (ComparableCircle)o;
			if(this == c){
				return 0;
			}
			else if(this.getRadius() > c.getRadius()){
				return 1;
				
			}
			else{
				return -1;
			}
		}
		return 0;
	}
	
}
