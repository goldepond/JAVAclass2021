package com.java.basic.oop.staticEx;

public class SingletonApp 
{
	public static void main(String[] args)
	{

		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
	}
	
}
