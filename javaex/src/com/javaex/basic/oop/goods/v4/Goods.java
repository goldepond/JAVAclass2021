package com.javaex.basic.oop.goods.v4;

public class Goods {

	private String name;
	private int price;
	
	public Goods(String name)
	{
		this.name = name;
		//持失切 1
		System.out.println("持失切1");
	}
	public Goods(String name, int price)
	{
		this.name = name;
		this.price = price;
		System.out.println("持失切2");
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int GetPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public void showInfow()
	{
		System.out.println(name + price);
	}
}
