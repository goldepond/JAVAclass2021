package com.javaex.basic;

public class Jaba20200811 
{
	public static void main(String[] args) 
	{
		//logicalOper();
		//bitOPer();
		//conditionerOper();
		//consoleOutput();
		randomEx();
	}

	
	public static void randomEx()
	{
		int rollcnt = 6;
		int total = 0;
		for(int i = 1;i< rollcnt; i++)
		{
			int num = (int)(Math.random()*6)+1;
			System.out.println(i);
			
			total += num;
		}
		
		System.out.println(total);
	}

}


