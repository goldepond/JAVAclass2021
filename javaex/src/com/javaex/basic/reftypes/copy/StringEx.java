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
		String fruit ="����";
		int total = 20;
		int eat =19;
		double eat12 =3.141592;
		System.out.printf("%d���� %s�߿��� %d�� �Ծ���",total, fruit, eat );
		
		String res = 
				String.format("���̻���� %f�Դϴ�", eat12);
		System.out.println(res);
		
		String ref = 
				String.format("���̻���� %.3f�Դϴ�", eat12);
		System.out.println(ref);
	}
}
