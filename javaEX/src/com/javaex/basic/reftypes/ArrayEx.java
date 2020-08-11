package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		///arrayBAsic();
		//arrayMemorytest();
	//	arrayNDim();
		//arrayCopy();
		arraySystemCopy();
	}
	public static void arrayMemorytest()
	{
		int scores [] = {70,80,90,100};
		int scores2[] = scores;
		
		System.out.println(scores.length);
		System.out.println(scores2[0]);
		System.out.println(scores == scores2);
		
		scores[0] =100;
		System.out.println(scores2[0]);
		
	}
	public static void arrayBAsic()
	{
		String[] names;
		int scores[];
		//----------------------킹기화ㅣ
		
		names = new String [] {"홍길동","김이택","전우치","킹갓택"};
		
		float height[] = {124.5f,	123.44f,	123.34f,	3232.2f};
		
		scores = new int[4];
		scores  [0]= 80;
		scores  [1]= 81;
		scores  [2]= 82;
		scores  [3]= 83;
		
		for(int i =0;i<scores.length;i++)
		{
			System.out.printf("%s(%2f):점수 = %d%n", names[i],height[i],scores[i]);
		}
	}
	public static void arrayNDim()
	{
		int[][] twoDim =  new int [3][5];
		
		int table[][] = 
			{
					{1,2,3,4,5},
					{7,8,9,10,11}
			};
		System.out.println(table.length);
		System.out.println(table[0].length);
		
		int sum = 0;
		for(int i=0; i<table.length;i++)
		{
			int subtotal =0;
			for(int f=0;f<table[i].length;f++)
			{
				subtotal += table[i][f];
			}
			System.out.println(subtotal);
			sum += subtotal;
		}
		System.out.println(sum);
	}
	public static void arrayCopy()
	{
		int scores[] = {90,80,70};
		
		int target[] = new int[10];
		
		for(int i=0;i<scores.length;i++)
		{
			target[i]= scores[i];
			
		}
		
		for(int i=0;i<target.length;i++)
		{
			System.out.println(target[i]);
			
		}
	}
	public static void arraySystemCopy()
	{
		int scores[] = {90,80,70,60,};
		int target[]= new int[10];
		
		System.arraycopy(scores, 0, target, 3, scores.length);

		for(int value: target)
		{
			System.out.println(value);
		}
		
	}
}
