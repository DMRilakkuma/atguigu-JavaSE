package com.atguigu.exer;

public class Manager extends Employee{

	private double bonus;

	public Manager() {
		super();
	}

	public Manager(double bonus, String name, int id, String salary) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void walk() {
		
		System.out.println("走路");

	}

	protected double getBonus() {
		return bonus;
	}

	protected void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
