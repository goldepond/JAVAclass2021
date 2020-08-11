package com.javaex.basic.reftypes.copy;

public class StringEx 
{

	public static void main(String[] args) 
	{
		stringBAsic();
		//STringFormat();
	}
	
	public static void stringBAsic()
	{
		String str;
		str = "Java";
		
		String str2  = "Java";
		String str3 = new String("Java");
		
		
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		
		
	}

	public static void STringFormat()
	{
		String fruit ="과일";
		int total = 20;
		int eat =19;
		double eat12 =3.141592;
		System.out.printf("%d개의 %s중에서 %d개 먹었음",total, fruit, eat );
		
		String res = 
				String.format("파이상수는 %f입니다", eat12);
		System.out.println(res);
		
		String ref = 
				String.format("파이상수는 %.3f입니다", eat12);
		System.out.println(ref);
	}
}
