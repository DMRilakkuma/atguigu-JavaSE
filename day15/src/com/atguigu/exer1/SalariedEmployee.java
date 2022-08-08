package com.atguigu.exer1;

public class SalariedEmployee extends Employee {
	private double monthlySalary;

	public SalariedEmployee() {
		super();
	}

	protected double getMonthlySalary() {
		return monthlySalary;
	}

	protected void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		return getMonthlySalary();

	}

	@Override
	public String toString() {
		return "SalariedEmployee [" + super.toString()+"]";
	}
	
	

	

}
