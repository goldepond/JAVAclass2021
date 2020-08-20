package com.java.basic.oop.staticEx;

public class Singleton
{
	//생성자 private -> new가 안됨
		private static Singleton instance = new Singleton();
	private void Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return instance;
	}
}
