package com.javaex.basic;

public class P1 {

	public static void main(String[] args) 
	{
		//logicalOper();
		//bitOPer();
		conditionerOper();
	}
	public static void logicalOper()
	{
		int n= 5;
		boolean b1 = n<5;
		boolean b2 = n>5;
		boolean r = b1&&b2;
		boolean r2 = b1||b2;
		System.out.println(r);
		System.out.println(r2);
		
		/////////////////////////////////
		
		
	}

	public static void bitOPer()
	{
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		int result= b1&b2;
		System.out.println(Integer.toBinaryString(result));
		
		int result2= b1|b2;
		System.out.println(Integer.toBinaryString(result2));
		
		int result3= ~b1;
		System.out.println(Integer.toBinaryString(result3));
		
		System.out.print(b1);
		int a =  b1<<1;
		System.out.print(a);
	
	
	}

	public static void conditionerOper()
	{
		//삼항연산자
		int a = 10;
		String message = ((a%2 == 0) ? ("짝수") : ("홀수"));
		System.out.println(message);
		
		int score = 85;
		String message2 = ((score >= 87) ? ("Good") : ((score>=50)?("pass"):("FAil")));
		System.out.println(message2);
	}
}
