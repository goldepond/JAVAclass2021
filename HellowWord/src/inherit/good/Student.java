package inherit.good;

public class Student extends Person
{
	String studentID;
	
	 String info() 
	{
			return "이름 : "+ name+ ", 나이 : "+ age +", 아이디 : "+studentID ;
	}
}
