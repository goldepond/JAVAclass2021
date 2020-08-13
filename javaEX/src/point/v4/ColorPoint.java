package point.v4;

public class ColorPoint extends Point
{
	private String color;
	
	public ColorPoint(String color)
	{
		super();
		this.color = color;
	}
	public ColorPoint(int x, int y ,String color)
	{
		super(x,y);
		this.color = color;
		
		System.out.println("컬러프린트 생성자");
		
	} 
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}

		@Override
		public void draw()
		{
			System.out.printf("색상점 (%d,%d,%s)을 그렸습니다 .%n", x,y,color);
		}
		
		public void draw(boolean show)
		{
			String message = show ? "그렸습니다." : "지웠습니다";
			System.out.printf("색상점 (%d,%d,%s)를 %s .%n", x,y,color,message);
			
			super.draw(show);
		}
}
