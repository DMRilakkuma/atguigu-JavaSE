package com.atguigu.exer;

public class OverloadExer {
	
//	2.编写程序，定义三个重载方法并调用。方法名为mOL。
//	三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
//	执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
//	在主类的main ()方法中分别用参数区别调用三个方法。
//	3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
//	法求两个double值中的最大值，第三个方法求三个double值中的最大值，
//	并分别调用三个方法。
	
	public static void main(String[] args) {
		
		Overload s = new Overload();
		s.mOL(5);
		s.mOL(5, 6);
		s.mOL("小不点");
		
		s.max(7, 9);
		s.max(12.0, 6.0);
		s.max(2.0, 23.0, 78.0);
		
	}
	

}

class Overload{
	

	public void mOL( int i){
		   System.out.println(i * i );
	}
	
	
	public void mOL(int i ,int j){
		System.out.println(i * j);
	}
	
	public void mOL (String i){
		System.out.println(i);
	}
	
	public void max (int i ,int j){
		int Max  = (i >j) ?i:j ;
		System.out.println(Max);
	}
	
	public void max (double i ,double j){
		double Max  = (i >j) ?i:j ;
		System.out.println(Max);
	}
	
	public void max(double i, double j, double k){
		double Max = (i > j)?i : j;
		Max  = (Max > k)?Max : k;
		System.out.println(Max);
	}
}