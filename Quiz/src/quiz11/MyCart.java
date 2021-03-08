package quiz11;

import java.util.Scanner;

public class MyCart {
	int money =10000;//가진돈 
	Product [] cart = new Product[1];
	//========================
	int  i =1;
	MyCart(int _money)
	{
		money = _money;
	}

	void buy(Product p)
	{
	//	Scanner scn = new Scanner(System.in);
	//	int scan1 = scn.nextInt();
		if(p instanceof Tv)
		{
			if(p.getPrice() < money)
			{
				add(p);
			}
		}
		else if(p instanceof Computer)
		{
			if(p.getPrice() < money)
			{
				add(p);
			}
		}
		else if(p instanceof Radio)
		{
			System.out.println(p.getPrice());
			if(p.getPrice() < money)
			{
				add(p);
			}
		}
	}
	
	
	void add(Product p)
	{
		if(i<=cart.length)
		{
			Product[] newcart = new Product [2 * this.i];
			for(int a=0; a<cart.length;a++)
			{
				newcart[a] = cart[a];
			}
		}
		
	}
	int totalprice=0;
	void info()
	{
		for(Product q: cart)
		{
			System.out.println(q.getName());
			totalprice += q.getPrice();
		}
		System.out.println(totalprice);
	}
}



















