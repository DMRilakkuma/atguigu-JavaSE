package com.atguigu.java1;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MIN_SPEED);
		System.out.println(Flyable.MAX_SPEED);
		
		Plane p = new Plane();
		p.fly();
		p.stop();
		
	}

}

interface Flyable{
	public static final int MAX_SPEED = 7900;
	public static final int MIN_SPEED = 0;
	
	public abstract void fly();
	
	public abstract void stop();
	
	
}
class CCA{
	
}


  class Plane extends CCA implements Flyable,Walk{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过引擎飞");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("驾驶员");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
  interface eat{
	  
  }
  
  
  interface Walk{
	  public abstract void run(); 
  }
  
  interface Person extends Walk,eat {
	  
  }
