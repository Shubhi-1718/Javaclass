public class overload 
{
	void add1(int x, int y)
	{
		int z;
		z=x+y;
		System.out.println("add1"+z);
	}

	void add1(float x, float y)
	{
		float z;
		z=x-y;
		System.out.println("add1"+z);
	}
	public static void main(String[] args)
	{
		overload a = new overload();
		a.add1(10,20);
		a.add1(10.3f,10.0f);
}
}
