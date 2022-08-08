package com.atguigu.java3;

public class InnerClassTest {
	public static void main(String[] args) {
		//调用静态内部类
		Person.Dogs dog = new Person.Dogs();
		dog.show();
		
		Person p = new Person();
		Person.Birds bird = p.new Birds();
		bird.sing();
		bird.display("黄鸣");
	}
	

}


 class Person{
	
	String name = "吕聪";
	int age;
	
	public void eat(){
		System.out.println("人要吃饭");
	}
	
	
	
	static class Dogs{
		
		String name;
		public Dogs(){
			
		}
		
		public void show(){
			System.out.println("卡拉是一条狗");
			
		}
		
		
	}
	
	  class Birds{
		String name = "杜鹃";
		public Birds(){
			
		}
		
		public void sing(){
			System.out.println("我是一只小小鸟");
			Person.this.eat();
		}
		
		public void display(String name){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
		
		
	}

	public void method(){
		class AA{
			
		}
	}
	
	
	{
		class BB{
			
		}
	}
	
	public Person(){
		class CC{
			
		}
	}
}
