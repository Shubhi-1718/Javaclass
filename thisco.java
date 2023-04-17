package college;

public class thisco 
{
	int roll;
	int marks;
	thisco(int roll, int marks)
	{
		this.roll=roll;
		this.marks=marks;
	}
	public static void main(String[] args) 
	{
		thisco sc = new thisco(2,78);
		
		System.out.println(sc.roll);
		System.out.println(sc.marks);
		
	}
}
