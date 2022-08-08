package com.atguigu.exer;

public class Exer4Test2 {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20];
		
		for(int i =0;i< stus.length;i++ )
		{
			
			stus[i] = new Student1();
			stus[i].number = i+1;
			stus[i].state = (int)(Math.random()*(6-1+1)+1);
			stus[i].score = (int)(Math.random()*(100-0-1));
			System.out.println(stus[i].info());
			
		}
		
		
		Exer4Test2 test =new Exer4Test2();
		test.print(stus);
		
		System.out.println("***********************");
		
		test.searchState(stus, 3);
		
		
		//冒泡排序
		System.out.println("********************");
		
		test.sort(stus);
		
		test.print(stus);
		
		
		
		
		
	  
	}
	/**
	 * 
	 * @param stus
	 */
	public void print (Student1[] stus)
	{
		for(int i = 0;i<stus.length;i++)
		{
			System.out.println(stus[i].info());
		}
	}
	
	/**
	 * 
	 * @param stus
	 * @param state
	 */
	public void searchState(Student1[] stus,int state)
	{
		for(int i =0;i<stus.length;i++)
		{
		   if(stus[i].state==3)
		    {
		
			System.out.println(stus[i].info());
		    }
		}
	}
	
	/**
	 * @Description 给Student1数组排序
	 * @author MC
	 * @date 
	 * @param stus
	 */
	public void sort(Student1[] stus)
	{
		for(int i = 0;i<stus.length-1;i++)
		{
			for(int j =0;j<stus.length-1-i;j++)
			{
				if(stus[j].score > stus[j+1].score)
				{
					Student1 temp  = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
			
		}
	}

}


class Student1{
	int number;
	int state;
	int score;
	
	public String info()
	{
		return "学号:"+number+", 年纪:"+state+", 成绩:"+score;
	}
	
	
	
}
