package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ThrowsTest {
	
	public static void main(String[] args) {
		try{
			method();
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void method() throws FileNotFoundException, IOException {
		test1();
	}
	
	
	
	
	public static void test1() throws IOException,FileNotFoundException{
		File file = new File("hello.text");
		FileInputStream fis =new FileInputStream(file);
		int date = fis.read();
		while(date != -1){
			System.out.println((char)date);
			date = fis.read();
		}
		fis.close();
		
	}

}




