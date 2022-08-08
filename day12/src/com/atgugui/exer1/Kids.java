package com.atgugui.exer1;

public class Kids extends ManKind {
	
	private int yearsOld;
	
	
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge(){
		
		
		
		
		System.out.println(this.yearsOld);
		
	}

	public Kids() {
		
	}

	public Kids(int yearsOld) {
	
		this.yearsOld = yearsOld;
	}
	
	public void employeed(){
		System.out.println("Kids should study and no job");
	}
	

}
