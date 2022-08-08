package com.atguigu.java;

public class SingletonTest {

}

class Bank {
	/**
	 * 饿汉式
	 */
	private Bank() {

	}

	// 创建对象
	private static Bank instance = new Bank();

	// 返回对象

	private static Bank getInstance() {
		return instance;
	}

}


class Bank1{
	/**
	 * 懒汉式
	 */
	
	private Bank1(){
		
	}
	
	private static Bank1 instance = null;
	
	private static Bank1 getInstance(){
		if(instance == null){
			instance = new Bank1();
			return instance;
		}
		
		return instance;
		
	}
	
}
