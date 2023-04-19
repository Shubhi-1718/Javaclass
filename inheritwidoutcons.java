
public class Abcd 
{
	int x,y,z;
	public void add(int x, int y)
	{
		z=x+y;
		System.out.println("Sum is "+z);
	}
	public void sub(int x, int y )
	{
		z=x-y;
		System.out.println("Subtraction is "+z);
	}
}
public class inabcd extends Abcd
{
	public void mul(int x, int y)
	{
		z=x*y;
		System.out.println("Multiplication is "+z);
	}
	public static void main(String[] args) {
		inabcd obj=new inabcd();
		obj.add(20, 20);
		obj.sub(20, 20);
		obj.mul(20, 20);

	}

}
