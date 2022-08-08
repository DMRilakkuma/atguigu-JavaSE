package com.atguigu.exer;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate[] arr = new MyDate[2];
		arr[0] = new MyDate();
		arr[1] = new MyDate();
		
		arr[0].year = 2000;
		arr[0].month=12;
		arr[0].day = 2;
		arr[0].put();
		
		arr[1].year = 2001;
		arr[1].month = 10;
		arr[1].day = 6;
		arr[1].put();
		
	}
	

}


class MyDate{
	int year;
	int month;
	int day;
	
	
	public void put()
	{
		System.out.println("出生日期为:"+year+"年"+month+"月"+day+"日");
	}
	
}
	

