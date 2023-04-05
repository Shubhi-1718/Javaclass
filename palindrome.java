package greater;

public class palindrome {

	public static void main(String[] args) {
		int num=111;
		int num2,rem,sum=0;
		num2=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(num2==sum)
			System.out.print("Number is palindrome");
	
		else
			System.out.println("Number is not palindrome");

	}

}
