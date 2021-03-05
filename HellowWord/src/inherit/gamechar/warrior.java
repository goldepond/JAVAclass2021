package inherit.gamechar;

public class warrior extends Player{

	warrior()
	{
		id = "전사";
		hp = 100;
		attack = 50;
		armor = 10;
	}
	void bash()
	{
		System.out.println("베쉬 공격");
	}

}
