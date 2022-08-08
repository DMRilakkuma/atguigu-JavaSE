package com.atguigu.exer3;

public class Account {
	
	private int id;//账号
	private double balance;//余额
	private double annuanlinterestRate;//年利率
	
	
	public Account(int id, double balance, double annuanlinterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuanlinterestRate = annuanlinterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuanlinterestRate() {
		return annuanlinterestRate;
	}

	public void setAnnuanlinterestRate(double annuanlinterestRate) {
		this.annuanlinterestRate = annuanlinterestRate;
	}
	
	public void withdraw(double amount){
		 if(balance < amount){
			 System.out.println("余额不足，取款失败");
			 return;
		 }
		 balance -= amount;
		 System.out.println("成功取款:"+amount);
	}
	
	public void deposit(double amount){
		if(amount > 0){
			balance +=amount;
			System.out.println("成功存款："+amount);
		}
		
	}
	
	
	
	


	
	
	
	

}
