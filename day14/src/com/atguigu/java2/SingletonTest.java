package com.atguigu.java2;

public class SingletonTest {
	
	public static void main(String[] args) {
		Bank bank1 = Bank.getIntance();
		Bank bank2 = Bank.getIntance();
		System.out.println(bank1 == bank2);
		
	}
	
	

}

class Bank{
	private Bank(){
		
	}
	private static Bank intance =  new Bank();
	
	
	public  static Bank getIntance(){
		return intance;
	}
	
}
