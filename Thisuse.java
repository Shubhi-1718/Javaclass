class Thisclass 
{
	Thisclass getA()
	{
		return this;
	}
	void msg()
	{
		System.out.println("fhregfhref");
	}
}

public class Return 
{
	public static void main(String[] args)
	{
		new Thisclass().getA().msg();
	}
}
