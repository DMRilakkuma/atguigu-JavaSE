package com.atguigu.java3;

public class BlockTest {
	
	 public static void main(String[] args) {
		 String id = Block.getId();
		 String id2 = Block.getId();
		 Block ablock1 = new Block();
		 Block ablock2 = new Block();
		 Block ablock3 = new Block();
		
	}

}


class Block{
	private String name;
	private int age;
	private static String id = "1001";
	
	public Block(){
		
	}
	
	public Block(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	static {
		System.out.println("hello");
		info();
		
	}
	
	{
		System.out.println("yes");
		eat();
		info();
	}
	
	public void eat(){
		System.out.println("我要吃饭");
	}
	
	public  void walk(){
		System.out.println("我要走路");
	}
	
	public static void info(){
		System.out.println("我是一个人");
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected static String getId() {
		return id;
	}
	
	
}    
   
