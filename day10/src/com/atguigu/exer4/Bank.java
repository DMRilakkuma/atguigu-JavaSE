package com.atguigu.exer4;

public class Bank {
	private Customer[] customers ;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
		
	}

	public Customer getCustomer(int index) {
		if(index >=0 && index < numberOfCustomers){
			return customers[index];
		}
		return null;
	}

	public int getNumberOfCustomer() {
		return numberOfCustomers;
		
		
	}
	
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f,l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;
	}
	
	
	
	

}
