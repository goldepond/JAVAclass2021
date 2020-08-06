package com.javaex.basic;

import java.util.Scanner;

//import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
		//logicalOper();
		//bitOPer();
		//conditionerOper();
		//consoleOutput();
		consoleInput();
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

	public static void consoleOutput()
	{
		//print = 개행 x / println = 개행 / printf = 형식화된 출력
		
		System.out.print("Hwllow ");
		System.out.println("Java");
		System.out.println("Java");
		//---------------------------------------
		System.out.print("Hellow \n Java\n");
		System.out.println("Hellow \t Java");
		System.out.print("Hellow, \"Java\" ");
	}

	public static void consoleInput()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름은?:");
		String name = scanner.next();
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		System.out.println("이름은 " + name + ",나이는" +age);
		scanner.close();
	}
	
	
}
