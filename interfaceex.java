package pratyush;

interface First 
{
	abstract void rate_of_interest();
}

class SBI implements First 
{
	public void rate_of_interest()
	{
		System.out.println("Rate of interest is "+9.6f);
	}
}
class PNB implements First 
{
	public void rate_of_interest()
	{
		System.out.println("Rate of interest is "+9.4f);
	}
}
public class Bank 
{
	public static void main(String[] args)
	{
		First obj = new SBI();
		First obj2= new PNB();
		//obj2=obj;
		obj.rate_of_interest();
		obj2.rate_of_interest();
	}
}
