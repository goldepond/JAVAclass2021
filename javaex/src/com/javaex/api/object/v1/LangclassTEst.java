package com.javaex.api.object.v1;

public class LangclassTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println(p.getClass());
	}


}
