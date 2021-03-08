package quiz11;

public class Main {


	public static void main(String[] args) 
	{
		Product pd = new Radio();
		MyCart mc = new MyCart(0); 
		mc.buy(pd);
	}

}
