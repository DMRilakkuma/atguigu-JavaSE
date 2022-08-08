package com.atguigu.exer1;

public class Account {
//	编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
//	码”、“存款余额”、“利率”、“最小余额”，定义封装这些
//	属性的方法。账号要自动生成。
//	编写主类，使用银行账户类，输入、输出3个储户的上述信息。
//	考虑：哪些属性可以设计成static属性。
	
	
	private int id;
	private String pwe;
	private double banlance;
	
	private static double interestRate;
	private static double MinMoney;
	
	private Account() {
		super();
		id++;
	}
	public Account(String pwe, double banlance) {
		super();
		this.pwe = pwe;
		this.banlance = banlance;
		id++;
	}
	protected String getPwe() {
		return pwe;
	}
	protected void setPwe(String pwe) {
		this.pwe = pwe;
	}
	protected double getBanlance() {
		return banlance;
	}
	protected void setBanlance(double banlance) {
		this.banlance = banlance;
	}
	protected int getId() {
		return id;
	}
	protected static double getInterestRate() {
		return interestRate;
	}
	protected static double getMinMoney() {
		return MinMoney;
	}
	protected static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	protected static void setMinMoney(double minMoney) {
		MinMoney = minMoney;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwe=" + pwe + ", banlance=" + banlance + "]";
	}
	
	
	
	
	

}
