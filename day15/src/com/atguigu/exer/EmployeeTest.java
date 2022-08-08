package com.atguigu.exer;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee manager = new Manager(1000,"库克",1,"男");
		
		manager.walk();
		
		Employee commonEmployee  = new CommonEmployee();
		commonEmployee.walk();
		
		
		Employee e  = new Employee(){

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("跑的很快");
				
			}
			
		};
		e.walk();
		
	}

}
