package com.atgugui.exer6;

import java.util.Scanner;
import java.util.Vector;

public class WrapperExer {
	public static void main(String[] args) {
		// 从键盘读入学生成绩
		Scanner scan = new Scanner(System.in);
		Vector v = new Vector();
		int Max = 0;
		for (;;) {
			System.out.println("请输入成绩：");
			int sorce = scan.nextInt();
			if (sorce < 0) {
				break;
			} else if (sorce > 100) {
				continue;

			}
			//
			if (sorce > Max) {
				Max = sorce;
			}
			// Integer s = new Integer(sorce);
			// v.addElement(s);

			v.addElement(sorce);

		}
		char  a ;

		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
//			Integer num = (Integer)obj;
//			int sorce = num.intValue();
			
			int sorce = (int)obj;
			if(Max - sorce <= 10){
				 a  = 'A';
			}
			else if(Max - sorce <= 20){
				a  = 'B';
			}
			else if(Max - sorce <= 30){
				a  = 'C';
			}
			
			else{
				a  = 'D';
			}
			
			System.out.println("成绩为："+sorce + ", 等级为："+ a);

		}
		
	}

}
