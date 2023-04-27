class A
{
	A()
	{
		this(10);
		System.out.println("This is default constructor ");
	}
	A(int x)
	{
		
		System.out.println("This is parameterized consructor "+x);
	}
}
public class Constructor 
{
	public static void main(String[] args)
	{
	 A obj = new A();
	}
}
