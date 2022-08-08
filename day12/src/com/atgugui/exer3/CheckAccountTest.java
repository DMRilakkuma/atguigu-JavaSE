package com.atgugui.exer3;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount  ac = new CheckAccount(1122,20000,0.045,5000);
		ac.withdraw(5000);
		System.out.println("你的账户余额为："+ac.getBalance());
		System.out.println("你的可透支余额："+ac.getOverdraft());
		ac.withdraw(18000);
		System.out.println("你的账户余额为："+ac.getBalance());
		System.out.println("你的可透支余额："+ac.getOverdraft());
		ac.withdraw(3000);
		System.out.println("你的账户余额为："+ac.getBalance());
		System.out.println("你的可透支余额："+ac.getOverdraft());
	}

}
