package point.v1;

public class Point 
{
	private int x;
	private int y;
	
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
		System.out.printf("Á¡(%d,%d)ÀÇ ÁÂÇ¥ %n", x,y);
	}
}
