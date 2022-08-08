package com.atgugui.java1;

public class Customer {
	
	private int age ;
	private String name;
	public int getA() {
		
		return age;
	}
	public void setA(int a) {
		this.age = a;
	}
	public String getB() {
		return name;
	}
	public void setB(String b) {
		this.name = b;
	}
	public Customer() {
		super();
	}
	public Customer(int a, String b) {
		super();
		this.age = a;
		this.name = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		if(this == obj)
//        return true;
//        
//        if(obj instanceof Customer){
//        	Customer cust = (Customer)obj;
//        	if(this.age == cust.age && this.name.equals(cust.name)){
//        		return true;
//        	}
//        	
//        	 return false;
//        }
//		return false;
//       
//    }
	
	
	

}
