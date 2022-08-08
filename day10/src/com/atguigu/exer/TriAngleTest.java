package com.atguigu.exer;

public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle t1 = new TriAngle();

		TriAngle t = new TriAngle(12,13);
		double area = t.getbase() * t.getheight();
		System.out.println(area);
	}

}
