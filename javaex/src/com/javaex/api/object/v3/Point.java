package com.javaex.api.object.v3;

public class Point implements Cloneable
{
	protected int x;
	protected int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;

		System.out.println("����Ʈ ������");
	}
	
	public Point()
	{
		
	}
	public int gerx()
	{
		return x;
	}
	
	public void setx(int x)
	{
		this.x = x;
	}
	
	public int gety()
	{
		return y;
	}
	public void sety(int y)
	{
		this.y = y;
	}
	
	public void draw()
	{
		System.out.printf("��(%d,%d)�� ��ǥ %n", x,y);
	}
	
	public void draw(boolean show)
	{
		String message = show ? "�׷Ƚ��ϴ�" : "�������ϴ�";
		System.out.printf("��(%d,%d)��  %s%n",x,y,message);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Point)
		{
			Point other = (Point)obj;
			return this.x == x && this.y==y;
		}
		return super.equals(obj);
	}

	
	public Point getClone()
	{
		Point clone = null;
		try 
		{
			return clone = (Point)clone();
		} 
		catch (CloneNotSupportedException e)
		{
			System.err.println("�����Ұ�!");
		}
		return clone;
	}
	
	
	
	
	
	
	
}
