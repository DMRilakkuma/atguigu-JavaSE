package com.atguigu.java2;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}

class Student{
	private int id;
	
	public void regist(int id) throws RuntimeException{
		this.id = id;
		if(id > 0){
			System.out.println(id);
		}
		else{
			throw new MyException("不能输入负数");
		}
	}
}
