package point.v4;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setx(10);
		p1.sety(20);
		
		Point p2 = new Point();
		p2.setx(20);
		p2.sety(30);
		
		p1.draw();
		p2.draw();
		
		p1.draw(false);
		p2.draw(false);
		
		ColorPoint cp = new ColorPoint("ทนตๅ");
		ColorPoint cp2 = new ColorPoint(19,29,"blue");
		cp.draw(true);
		cp2.draw(true);
		

	}

}
