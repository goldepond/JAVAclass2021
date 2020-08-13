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
		System.out.printf("점(%d,%d)의 좌표 %n", x,y);
	}
	
	public void draw(boolean show)
	{
		String message = show ? "그렸습니다" : "지웠습니다";
		System.out.printf("점(%d,%d)을  %s%n",x,y,message);
	}
}
