package com.arguigu.java;


public class InstanceTest {
	public static void main(String[] args) {
		 Phone p = new Phone();
//		  p = null;
		  System.out.println(p);
		  
		  p.sendEmail();
		  p.playGame();
		  
//		  
//		  new Phone().sendEmail();
//		  new Phone().playGame();
		
		  
		  new Phone().price = 1999;
		  new Phone().showPrice();
		  System.out.println("***************************");
		  
		  PhoneMall mall =new PhoneMall();
		  mall.show(p);
		  mall.show(new Phone());
	}

}

class PhoneMall{
	
	public void show(Phone phone){
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;
	
	public void sendEmail(){
		System.out.println("发送邮件");
		
	}
	
	public void playGame(){
		System.out.println("玩游戏");
	}
	
	public void showPrice(){
		System.out.println("手机价格为："+price);
	}
}
