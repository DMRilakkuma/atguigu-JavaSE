package com.atguigu.java;

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		u1.talk("韩语");
		
	}

}





class User{
	
	String name;
	int age ;
	boolean isMale;
	
	public void talk(String language){
		System.out.println("我们使用"+language+"进行交流");
	}
	
	public void eat(){
		String food = "烙饼";
		System.out.println("北方人喜欢吃："+food);
	}
}
