package assignments;

public class Statickeyword
{
	
	static int num=1;
	public static void func()
	{
		num++;
		System.out.println(num);
	}
	
	public static void main(String[] args)
	{
		func();
		func();
		func();
	}
	static
	{
		System.out.println("Printed without calling ");
	}
