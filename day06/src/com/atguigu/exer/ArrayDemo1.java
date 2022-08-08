
package com.atguigu.exer;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 2. 从键盘读入学生成绩，找出最高分，
		// 并输出学生成绩等级。
		// 成绩>=最高分-10 等级为’A’
		// 成绩>=最高分-20 等级为’B’
		// 成绩>=最高分-30 等级为’C’
		// 其余 等级为’D’
		// 提示：先读入学生人数，根据人数创建int数组，
		// 存放学生成绩。
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生的人数:");
		int number = scan.nextInt();
		int[] arr = new int[number];
		int max = 0;
		System.out.println("请输入学生成绩：");

		for (int i = 0; i < number; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// max =arr[i]>max?arr[i]:max;//最大数为max
	

	char level;for(
	int i = 0;i<number;i++)
	{

		if (arr[i] >= max - 10) {
			level = 'A';
		} else if (arr[i] >= max - 20 && arr[i] < max - 10) {
			level = 'B';
		} else if (arr[i] >= max - 30 && arr[i] < max - 20) {
			level = 'C';
		} else {
			level = 'D';
		}
		System.out.println("student" + i + " score is " + arr[i] + ",grade is " + level);
	}

}

}
