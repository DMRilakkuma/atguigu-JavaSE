package com.atguigu.java1;

public class UsbTest {
	public static void main(String[] args) {
		Computer cut = new Computer();
		Flash flash = new Flash();
		cut.finsh(flash);
		// 创建非匿名实现类的非匿名对象
		Flash f = new Flash();
		cut.finsh(f);

		// 创建接口的非匿名实现类的匿名对象
		cut.finsh(new Printer());

		// 创建接口的匿名实现类的匿名对象

		cut.finsh(new USB() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("开始考车");

			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("考试结束");

			}

		});
		
		//创建接口的匿名实现类的非匿名对象
		
		USB person = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("1");
				
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("2");
				
			}

		
			
			
		};
		
		cut.finsh(person);
	}

}

class Computer {
	public void finsh(USB usb) {
		usb.start();
		System.out.println("运行");
		usb.stop();

	}
}

interface USB {
	void start();

	void stop();
}

class Flash implements USB {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("开始");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("结束");

	}

}

class Printer extends Flash {

}
