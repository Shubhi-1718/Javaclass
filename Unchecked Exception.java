class Userdefined extends Exception
{
	public static void method(int age)
	{
		if(age<18)
			throw new ArithmeticException("Person not eligible to vote");
		else
			System.out.println("Person eligible to vote");
		
	}
}
public class Userclass {

	public static void main(String[] args) 
	{
		Userdefined.method(2);
		System.out.println("Use of throw");
	}

}
