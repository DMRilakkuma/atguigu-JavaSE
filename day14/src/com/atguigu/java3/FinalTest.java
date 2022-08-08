package com.atguigu.java3;

public class FinalTest {

   final int AGE ;
    static final String NAME = "吕聪";
    
    {
    	
    }
    
    public FinalTest(){
    	AGE = 1;
    	
    }
    
    public FinalTest(int n){
    	AGE = n;
    	
    	
    }
    
    public void put (final  int num ){
    		
    	System.out.println(num);
    }
    
    
    public static void main(String[] args) {
		FinalTest f = new FinalTest();
		f.put(10);
		System.out.println(FinalTest.NAME);
	      
		
	}
    
    
    
}
