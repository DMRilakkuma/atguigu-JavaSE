package com.atguigu.exer1;

public class AccountTest {
	
	public static void main(String[] args) {
		Account.setInterestRate(0.012);
		Account.setMinMoney(1);
		
		Account ac1 = new Account("0000",2000);
		Account ac2 = new Account ("12345",5000);
		Account ac3 = new Account ("23456",7000);
		
		System.out.println(ac1);
		
		
		
	}

}
