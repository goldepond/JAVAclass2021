package com.javaex.basic.oop.goods.v2;

public class GoodApp 
	{
	public static void main(String[] args) 
	{
//		 TODO Auto-generated method stub
		Goods notebook = new Goods();
//		notebook.name = "LG±×·¥f";
//	notebook.price = 150;
	
//	System.out.printf("%s,%d¿ø%n", notebook.name,notebook.price);
	
	notebook.setName("LG¤·¤·");
	notebook.setPrice(15000);
	notebook.showInfow();
	}
}
