package assignments;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1= sc.nextInt();
		System.out.println("Enter second number ");
		int num2= sc.nextInt();
		System.out.println("Enter third number ");
		int num3= sc.nextInt();
		findgreatest(num1,num2,num3);
	}
	public static void findgreatest(int num1, int num2, int num3)
	{
		if(num1>num2 && num1>num3)
			System.out.println(num1 + " is the greatest");
		else
		if(num2>num3 && num2>num1)
			System.out.println(num2 + " is the greatest");
		else
		if(num3>num1 && num3>num2)
			System.out.println(num3 + " is the greatest");
		else
			System.out.println("All are equal");
	}
}
