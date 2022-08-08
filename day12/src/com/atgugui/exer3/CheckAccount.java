package com.atgugui.exer3;

public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount() {

	}

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;

	}
	
	

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public void withdraw(double amount){
		if(amount <= getBalance()){
//			setBalance(getBalance() - amount);
			super.withdraw(amount);
		}
		else{
			double num = amount - getBalance();
			if( num <= overdraft ){
				overdraft -= num;
				setBalance(0);
			}
			else{
				System.out.println("超过可透支限额");
			}
		}
	}

}
