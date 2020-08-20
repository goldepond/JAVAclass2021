package com.java.basic.oop.staticEx;

public class StaticExApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExjava s1 = new StaticExjava();
		System.out.println(StaticExjava.refcount);
		StaticExjava s2 = new StaticExjava();
		System.out.println(StaticExjava.refcount);
		
	}

}
