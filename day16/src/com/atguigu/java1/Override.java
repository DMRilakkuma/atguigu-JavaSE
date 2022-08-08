package com.atguigu.java1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Override {
	public static void main(String[] args) throws IOException {
		Text t = new Text();
		t.method(new Subclass());
	    
	}

}

class Text{
	public void method(Superclass subclass) throws IOException{
		subclass.method();
	}
	
}

class Superclass{
	public void method() throws IOException{
		System.out.println("父类");
	}
}


class Subclass extends Superclass{
	public void method() throws FileNotFoundException{
		System.out.println("子类");
	}
}
