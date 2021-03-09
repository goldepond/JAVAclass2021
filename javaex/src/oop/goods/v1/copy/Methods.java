package oop.goods.v1.copy;

public class Methods {

	public static void main(String[] args) 
	{
		
		System.out.println("sim:"+sum(10,20));
		System.out.println("sim2:"+sum(10,20,30,40,50));

		// TODO Auto-generated method stub
	}
	private  static double sum(double a , double b)
	{
		return a+b;
	}
	
	private static void printsum(String message, double...values)
	{
		double total= sum(values);
		System.out.println("sim:"+total);
	}
	private static double sum(double...values)
	{
		System.out.println(values.length);
		double total = 0;
		for(double val: values)
		{
			total += val;	
		}
		return total;
	}

}
