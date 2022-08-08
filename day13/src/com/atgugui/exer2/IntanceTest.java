package com.atgugui.exer2;

public class IntanceTest {

	public static void main(String[] args) {
		IntanceTest test = new IntanceTest();
		test.mathod(new Graduate());
		
		
	}
	
	public void mathod(Person e) {
		String s = e.getInfo();
		System.out.println(s);

		if (e instanceof Person) {
			System.out.println(1);
		}
		if (e instanceof Student) {
			System.out.println(2);
		}
		if (e instanceof Graduate) {
			System.out.println(1);
		}

	}

	

}
