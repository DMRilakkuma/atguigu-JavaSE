package com.atgugui.exer3;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account(1122,20000,0.045);
		a.withdraw(30000);
		System.out.println("你的账户余额为："+a.getBalance());
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("你的账户余额为："+a.getBalance());
		System.out.println("月利率为："+(a.getAnnualInterestRate()/12*100)+"%");
	
		
	}

}
