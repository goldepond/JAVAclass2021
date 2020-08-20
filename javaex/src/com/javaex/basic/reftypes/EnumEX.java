package com.javaex.basic.reftypes;

public class EnumEX {

	public static void main(String[] args) {
		usingEnum();
	}
	
	public static void usingEnum()
	{
		WeekDay dow = WeekDay.monday;
		
		System.out.printf("오늘은 %s(%d)입니다%n", dow.name(),dow.ordinal());
		
		String str = "sunday";
		WeekDay obj = WeekDay.valueOf(str);
		System.out.printf("문자열 %s는 열거상수 %d %n",str,obj.ordinal());
		//WeekDay obj = WeekDay.sunday
		
		
	}

}
