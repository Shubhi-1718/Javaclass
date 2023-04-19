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
	void add1(float x, float y,float z)
	{
		float f;
		f=x+y+z;
		System.out.println("add1"+f);
	}
	void add1(double x,double y)
	{
		double z;
		z=x+y;
		
		System.out.println("add1"+z);
	}	
	public static void main(String[] args)
	{
		overload a = new overload();
		a.add1(10,20); //int 
		a.add1(10.3f,10.0f); //float
		a.add1(10.2,10.2); //double 
}
}
