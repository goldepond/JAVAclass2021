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
		
		System.out.println("�÷�����Ʈ ������");
		
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
			System.out.printf("������ (%d,%d,%s)�� �׷Ƚ��ϴ� .%n", x,y,color);
		}
		
		public void draw(boolean show)
		{
			String message = show ? "�׷Ƚ��ϴ�." : "�������ϴ�";
			System.out.printf("������ (%d,%d,%s)�� %s .%n", x,y,color,message);
			
			super.draw(show);
		}
}
