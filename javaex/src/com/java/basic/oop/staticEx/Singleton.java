package com.java.basic.oop.staticEx;

public class Singleton
{
	//������ private -> new�� �ȵ�
		private static Singleton instance = new Singleton();
	private void Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return instance;
	}
}
