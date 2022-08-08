package com.atguigu.exer5;
import java.util.*;

public class Guigucaixiang {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Exer e = new Exer();
		System.out.println(e.put(num));

	}

}

class Exer {
	public int  put(int num) {
		
		if(num == 1){
			return 1;
		}
		
		else{
			if (num % 2 == 0) {
				num = num / 2;
				
			} else {
				num = num * 3 + 1;
			}
			
			return put(num);
		}
		
		
		
		
		
		
	}
}
