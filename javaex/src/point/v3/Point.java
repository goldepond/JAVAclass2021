package point.v3;

public class Point 
{
	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
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
}
