class Number
{
	private double num;
	Number(double num)
	{
		this.num=num;
	}
	
	public boolean isZero()
	{
		return num==0 ;
	}
	public boolean isPostive()
	{
		return num>0;
	}
	public boolean isNegative()
	{
		return num<0;
	}
	public boolean isOdd()
	{
		return num%2!=0;
	}
	public boolean isEven()
	{
		return num%2==0;
	}
	public boolean isPrime()
	{
		int value=(int)num;
		int count=0;
		if(num<=1)
			return false;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if (count>2)
			return false;
		else
			return true;
	}
	public boolean isArmstrong()
	{
		int value= (int)num;
		int temp2=value;
		int count=0;
		while(temp2!=0)
		{
			count++;
		}
		int sum=0;
		 temp2=value;
		while(temp2>0)
		{
			int d=temp2%10;
			sum+=Math.pow(d,count);
			temp2=temp2/10;
		}
		return sum==value;
	}
}
public class Abc 
{

	public static void main(String[] args) 
	{
		Number n = new Number(-10);
		System.out.println(n.isPostive());
		System.out.println(n.isEven());
		System.out.println(n.isPrime());
		System.out.println(n.isArmstrong());
		System.out.println(n.isOdd());
		System.out.println(n.isNegative());
	}

}
