package com.java.basic.oop.staticEx;

public class StaticExjava {
	
	public static int refcount;
	public static String classVAr;
	public String instanceVar;
	
	static
	{
		refcount =0;
		classVAr ="Static members";
	}

	public void StaticEX()
	{
		refcount++;
		instanceVar = "Instance member";
		System.out.println(refcount);
	}

	@Override
	protected void finalize() throws Throwable
	{
		refcount--;
		super.finalize();
		System.out.println("¼Ò¸êÀÚ");
	}

		
}
