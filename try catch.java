public class trycatchfu {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int num=50/0;
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Final block");
		}
		System.out.println("This is line after try catch ");
		}

}
