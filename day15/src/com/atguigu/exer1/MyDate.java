package com.atguigu.exer1;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		super();
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	protected int getYear() {
		return year;
	}

	protected void setYear(int year) {
		this.year = year;
	}

	protected int getMonth() {
		return month;
	}

	protected void setMonth(int month) {
		this.month = month;
	}

	protected int getDay() {
		return day;
	}

	protected void setDay(int day) {
		this.day = day;
	}

	
	public String toDateString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}



}
