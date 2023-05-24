class UserdefinedException extends Exception 
{
	UserdefinedException(String str)
	{
		super(str);
	}
}
public class Userclass {

	public static void main(String[] args) 
	{
		try
		{
			throw new UserdefinedException("This is user-defined exception");
		}
		catch(UserdefinedException ude)
		{
			System.out.println("Caught the exception");
			System.out.println(ude.getMessage());
		}

	}

}
