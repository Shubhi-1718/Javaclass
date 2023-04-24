abstract class Abs_class 
{
	Abs_class()
	{
		System.out.println("This is parent class constructor");
	}
	
	abstract void hello(); 
	void nhello()
	{
		System.out.println("This is non abstract method ");
	}
}
class Absextend extends Abs_class
{
	Absextend()
	{
		System.out.println("this is child class constructor");
	}
	void hello()
	{
		System.out.println("This is abstract method");
	}
	
}
public class Main 
{
	public static void main(String[] args)
	{
	Abs_class obj= new Absextend();
	obj.hello();
	obj.nhello();
	}
	
}
