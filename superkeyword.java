public class superclass 
{
	int age;
	superclass(int age)
	{
		this.age=age;
	}
	public void move()
	{
		System.out.println("Age in base class "+age);
	}
}
public class baseclass extends superclass
{
	baseclass(int age)
	{
		super(age);
	}

	private void superclass(int x) {
		// TODO Auto-generated method stub
		
	}
	int age=10;
	public void move()
	{
		super.move();
		age=age+super.age;
		System.out.println("Age in base class "+age);
	}

	public static void main(String[] args)
	{	
		superclass obj = new baseclass(30);
		obj.move();
	}

}

