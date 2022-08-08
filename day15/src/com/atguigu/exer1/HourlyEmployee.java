package com.atguigu.exer1;

public class HourlyEmployee extends Employee{
	
	private  double wage;
	private  int hour;
	
	

	public HourlyEmployee() {
		super();
	}
	
	

	public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	
	



	protected double getWage() {
		return wage;
	}



	protected void setWage(double wage) {
		this.wage = wage;
	}



	protected int getHour() {
		return hour;
	}


	protected void setHour(int hour) {
		this.hour = hour;
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWage() * getHour();
		
	}



	@Override
	public String toString() {
		return "Employee ["+ super.toString()+"]";
	}



	
	
	

}
