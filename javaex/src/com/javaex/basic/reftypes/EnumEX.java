package com.javaex.basic.reftypes;

public class EnumEX {

	public static void main(String[] args) {
		usingEnum();
	}
	
	public static void usingEnum()
	{
		WeekDay dow = WeekDay.monday;
		
		System.out.printf("������ %s(%d)�Դϴ�%n", dow.name(),dow.ordinal());
		
		String str = "sunday";
		WeekDay obj = WeekDay.valueOf(str);
		System.out.printf("���ڿ� %s�� ���Ż�� %d %n",str,obj.ordinal());
		//WeekDay obj = WeekDay.sunday
		
		
	}

}
