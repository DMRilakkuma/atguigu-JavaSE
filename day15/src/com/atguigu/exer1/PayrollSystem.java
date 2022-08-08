package com.atguigu.exer1;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		Employee [] emps = new Employee[2];
		emps[0] = new SalariedEmployee("王兵", 1001, new MyDate(2000,12,2), 10000);
		emps[1] = new HourlyEmployee("吕大佐",1002,new MyDate(2000,11,8),60,10);
		
		for(int i = 0;i < emps.length;i++){
			System.out.println(emps[i]);
			if(emps[i].getBirthday().getMonth() == month){
				System.out.println("生日快乐！工资加100");
			}
		}
	}

}
